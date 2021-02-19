package irita.sdk.module.keys;

import com.codahale.xsalsa20poly1305.SimpleBox;
import irita.sdk.util.Bech32Utils;
import irita.sdk.util.Bip44Utils;
import irita.sdk.util.HashUtils;
import irita.sdk.util.SM2Utils;
import org.apache.commons.lang3.ArrayUtils;
import org.bitcoinj.crypto.DeterministicKey;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;
import org.mindrot.jbcrypt.BCrypt;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

import static irita.sdk.constant.Armored.*;
import static irita.sdk.module.keys.BCryptImpl.decode_base64;

public class KeyManager implements Key {
    private BigInteger privKey;
    private String addr;
    private String mnemonic;
    // this KEY_PATH just for iris
    private static final String KEY_PATH = "m/44'/118'/0'/0/0";
    private static final String HRP = "iaa";

    public KeyManager(String mnemonic) {
        byte[] seed = Bip44Utils.getSeed(mnemonic);
        DeterministicKey dk = Bip44Utils.getDeterministicKey(mnemonic, seed, KEY_PATH);
        BigInteger privKey = dk.getPrivKey();
        ECPoint publicKey = SM2Utils.getPublicKeyFromPrivkey(privKey);

        byte[] encoded = publicKey.getEncoded(true);
        byte[] hash = HashUtils.sha256(encoded);
        byte[] pre20 = new byte[20];
        System.arraycopy(hash, 0, pre20, 0, 20);

        this.addr = Bech32Utils.toBech32(HRP, pre20);
        this.privKey = privKey;
        this.mnemonic = mnemonic;
    }

    public KeyManager(BigInteger privKey) {
        ECPoint publicKey = SM2Utils.getPublicKeyFromPrivkey(privKey);
        byte[] encoded = publicKey.getEncoded(true);
        byte[] hash = HashUtils.sha256(encoded);
        byte[] pre20 = new byte[20];
        System.arraycopy(hash, 0, pre20, 0, 20);

        this.addr = Bech32Utils.toBech32(HRP, pre20);
        this.privKey = privKey;
    }

    @Override
    public byte[] sign(String stdSignMsg) {
        byte[] signDoc = stdSignMsg.getBytes(StandardCharsets.UTF_8);
        byte[] res = new byte[0];
        try {
            res = SM2Utils.sign(this.getPrivKey(), signDoc);
        } catch (CryptoException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public String export(String password) throws IOException {
        byte[] privKeyTemp = privKey.toByteArray();
        byte[] prefixAmino = getPrefixAmino(PRIV_KEY_NAME);
        byte[] privKeyAmino = ArrayUtils.addAll(prefixAmino, privKeyTemp);

        String salt = BCrypt.gensalt(LOG_ROUNDS);
        String keyHash = BCrypt.hashpw(password, salt);
        byte[] keyHashByte = keyHash.getBytes(StandardCharsets.UTF_8);
        byte[] keyHashSha256 = HashUtils.sha256(keyHashByte);

        SimpleBox box = new SimpleBox(keyHashSha256);
        byte[] encBytes = box.seal(privKeyAmino);

        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ArmoredOutputStreamImpl aOS = new ArmoredOutputStreamImpl(byteStream);
        String realSaltString = salt.substring(REAL_SALT_BEGIN_POS, REAL_SALT_BEGIN_POS + REAL_SALT_BASE64_LEN);
        byte[] realSaltByte = decode_base64(realSaltString, 16);

        aOS.setHeader("salt", Hex.toHexString(realSaltByte).toUpperCase());
        aOS.setHeader("type", "sm2");
        aOS.setHeader("kdf", "bcrypt");
        aOS.write(encBytes);
        aOS.close();

        return byteStream.toString().trim();
    }

    public byte[] getPrefixAmino(String algoPrivKeyName) {
        byte[] hash = HashUtils.sha256(algoPrivKeyName.getBytes(StandardCharsets.UTF_8));
        int ptr = 0;
        while (hash[ptr] == 0) ptr++;
        ptr += 3;
        while (hash[ptr] == 0) ptr++;
        byte[] prefix = new byte[5];
        System.arraycopy(hash, ptr, prefix, 0, 4);
        prefix[4] = 32;
        return prefix;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    @Override
    public BigInteger getPrivKey() {
        return privKey;
    }

    @Override
    public String getAddr() {
        return addr;
    }

    @Override
    public String toString() {
        return "KeyManager{" +
                "privKey='" + privKey + '\'' +
                ", addr='" + addr + '\'' +
                ", mnemonic='" + mnemonic + '\'' +
                '}';
    }
}

