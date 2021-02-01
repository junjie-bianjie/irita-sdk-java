package sdk;

import irita.sdk.util.HttpUtils;
import org.junit.Test;

public class HttpUtilsTest {
    @Test
    public void get() throws Exception {
        String res = HttpUtils.get("http://localhost:26657", null);
        System.out.println(res);
    }

    @Test
    public void post()  throws Exception {
        String res = HttpUtils.post("http://localhost:8085/test-post", "");
        System.out.println(res);
    }
}
