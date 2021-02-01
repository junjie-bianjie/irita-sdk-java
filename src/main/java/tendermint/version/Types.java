// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/version/types.proto

package tendermint.version;

public final class Types {
  private Types() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AppOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tendermint.version.App)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 protocol = 1;</code>
     */
    long getProtocol();

    /**
     * <code>optional string software = 2;</code>
     */
    java.lang.String getSoftware();
    /**
     * <code>optional string software = 2;</code>
     */
    com.google.protobuf.ByteString
        getSoftwareBytes();
  }
  /**
   * <pre>
   * App includes the protocol and software version for the application.
   * This information is included in ResponseInfo. The App.Protocol can be
   * updated in ResponseEndBlock.
   * </pre>
   *
   * Protobuf type {@code tendermint.version.App}
   */
  public  static final class App extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tendermint.version.App)
      AppOrBuilder {
    // Use App.newBuilder() to construct.
    private App(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private App() {
      protocol_ = 0L;
      software_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private App(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              protocol_ = input.readUInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              software_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tendermint.version.Types.internal_static_tendermint_version_App_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tendermint.version.Types.internal_static_tendermint_version_App_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tendermint.version.Types.App.class, tendermint.version.Types.App.Builder.class);
    }

    public static final int PROTOCOL_FIELD_NUMBER = 1;
    private long protocol_;
    /**
     * <code>optional uint64 protocol = 1;</code>
     */
    public long getProtocol() {
      return protocol_;
    }

    public static final int SOFTWARE_FIELD_NUMBER = 2;
    private volatile java.lang.Object software_;
    /**
     * <code>optional string software = 2;</code>
     */
    public java.lang.String getSoftware() {
      java.lang.Object ref = software_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        software_ = s;
        return s;
      }
    }
    /**
     * <code>optional string software = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSoftwareBytes() {
      java.lang.Object ref = software_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        software_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (protocol_ != 0L) {
        output.writeUInt64(1, protocol_);
      }
      if (!getSoftwareBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, software_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (protocol_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, protocol_);
      }
      if (!getSoftwareBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, software_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof tendermint.version.Types.App)) {
        return super.equals(obj);
      }
      tendermint.version.Types.App other = (tendermint.version.Types.App) obj;

      boolean result = true;
      result = result && (getProtocol()
          == other.getProtocol());
      result = result && getSoftware()
          .equals(other.getSoftware());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getProtocol());
      hash = (37 * hash) + SOFTWARE_FIELD_NUMBER;
      hash = (53 * hash) + getSoftware().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tendermint.version.Types.App parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tendermint.version.Types.App parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tendermint.version.Types.App parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tendermint.version.Types.App parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tendermint.version.Types.App parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tendermint.version.Types.App parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static tendermint.version.Types.App parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static tendermint.version.Types.App parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tendermint.version.Types.App parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tendermint.version.Types.App parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(tendermint.version.Types.App prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * App includes the protocol and software version for the application.
     * This information is included in ResponseInfo. The App.Protocol can be
     * updated in ResponseEndBlock.
     * </pre>
     *
     * Protobuf type {@code tendermint.version.App}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tendermint.version.App)
        tendermint.version.Types.AppOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tendermint.version.Types.internal_static_tendermint_version_App_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tendermint.version.Types.internal_static_tendermint_version_App_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tendermint.version.Types.App.class, tendermint.version.Types.App.Builder.class);
      }

      // Construct using tendermint.version.Types.App.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        protocol_ = 0L;

        software_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tendermint.version.Types.internal_static_tendermint_version_App_descriptor;
      }

      public tendermint.version.Types.App getDefaultInstanceForType() {
        return tendermint.version.Types.App.getDefaultInstance();
      }

      public tendermint.version.Types.App build() {
        tendermint.version.Types.App result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public tendermint.version.Types.App buildPartial() {
        tendermint.version.Types.App result = new tendermint.version.Types.App(this);
        result.protocol_ = protocol_;
        result.software_ = software_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof tendermint.version.Types.App) {
          return mergeFrom((tendermint.version.Types.App)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tendermint.version.Types.App other) {
        if (other == tendermint.version.Types.App.getDefaultInstance()) return this;
        if (other.getProtocol() != 0L) {
          setProtocol(other.getProtocol());
        }
        if (!other.getSoftware().isEmpty()) {
          software_ = other.software_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        tendermint.version.Types.App parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (tendermint.version.Types.App) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long protocol_ ;
      /**
       * <code>optional uint64 protocol = 1;</code>
       */
      public long getProtocol() {
        return protocol_;
      }
      /**
       * <code>optional uint64 protocol = 1;</code>
       */
      public Builder setProtocol(long value) {
        
        protocol_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 protocol = 1;</code>
       */
      public Builder clearProtocol() {
        
        protocol_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object software_ = "";
      /**
       * <code>optional string software = 2;</code>
       */
      public java.lang.String getSoftware() {
        java.lang.Object ref = software_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          software_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string software = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSoftwareBytes() {
        java.lang.Object ref = software_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          software_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string software = 2;</code>
       */
      public Builder setSoftware(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        software_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string software = 2;</code>
       */
      public Builder clearSoftware() {
        
        software_ = getDefaultInstance().getSoftware();
        onChanged();
        return this;
      }
      /**
       * <code>optional string software = 2;</code>
       */
      public Builder setSoftwareBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        software_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:tendermint.version.App)
    }

    // @@protoc_insertion_point(class_scope:tendermint.version.App)
    private static final tendermint.version.Types.App DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tendermint.version.Types.App();
    }

    public static tendermint.version.Types.App getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<App>
        PARSER = new com.google.protobuf.AbstractParser<App>() {
      public App parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new App(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<App> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<App> getParserForType() {
      return PARSER;
    }

    public tendermint.version.Types.App getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ConsensusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tendermint.version.Consensus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 block = 1;</code>
     */
    long getBlock();

    /**
     * <code>optional uint64 app = 2;</code>
     */
    long getApp();
  }
  /**
   * <pre>
   * Consensus captures the consensus rules for processing a block in the blockchain,
   * including all blockchain data structures and the rules of the application's
   * state transition machine.
   * </pre>
   *
   * Protobuf type {@code tendermint.version.Consensus}
   */
  public  static final class Consensus extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tendermint.version.Consensus)
      ConsensusOrBuilder {
    // Use Consensus.newBuilder() to construct.
    private Consensus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Consensus() {
      block_ = 0L;
      app_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Consensus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              block_ = input.readUInt64();
              break;
            }
            case 16: {

              app_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tendermint.version.Types.internal_static_tendermint_version_Consensus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tendermint.version.Types.internal_static_tendermint_version_Consensus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tendermint.version.Types.Consensus.class, tendermint.version.Types.Consensus.Builder.class);
    }

    public static final int BLOCK_FIELD_NUMBER = 1;
    private long block_;
    /**
     * <code>optional uint64 block = 1;</code>
     */
    public long getBlock() {
      return block_;
    }

    public static final int APP_FIELD_NUMBER = 2;
    private long app_;
    /**
     * <code>optional uint64 app = 2;</code>
     */
    public long getApp() {
      return app_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (block_ != 0L) {
        output.writeUInt64(1, block_);
      }
      if (app_ != 0L) {
        output.writeUInt64(2, app_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (block_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, block_);
      }
      if (app_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, app_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof tendermint.version.Types.Consensus)) {
        return super.equals(obj);
      }
      tendermint.version.Types.Consensus other = (tendermint.version.Types.Consensus) obj;

      boolean result = true;
      result = result && (getBlock()
          == other.getBlock());
      result = result && (getApp()
          == other.getApp());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + BLOCK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBlock());
      hash = (37 * hash) + APP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getApp());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tendermint.version.Types.Consensus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tendermint.version.Types.Consensus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tendermint.version.Types.Consensus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tendermint.version.Types.Consensus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tendermint.version.Types.Consensus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tendermint.version.Types.Consensus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static tendermint.version.Types.Consensus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static tendermint.version.Types.Consensus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tendermint.version.Types.Consensus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tendermint.version.Types.Consensus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(tendermint.version.Types.Consensus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Consensus captures the consensus rules for processing a block in the blockchain,
     * including all blockchain data structures and the rules of the application's
     * state transition machine.
     * </pre>
     *
     * Protobuf type {@code tendermint.version.Consensus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tendermint.version.Consensus)
        tendermint.version.Types.ConsensusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tendermint.version.Types.internal_static_tendermint_version_Consensus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tendermint.version.Types.internal_static_tendermint_version_Consensus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tendermint.version.Types.Consensus.class, tendermint.version.Types.Consensus.Builder.class);
      }

      // Construct using tendermint.version.Types.Consensus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        block_ = 0L;

        app_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tendermint.version.Types.internal_static_tendermint_version_Consensus_descriptor;
      }

      public tendermint.version.Types.Consensus getDefaultInstanceForType() {
        return tendermint.version.Types.Consensus.getDefaultInstance();
      }

      public tendermint.version.Types.Consensus build() {
        tendermint.version.Types.Consensus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public tendermint.version.Types.Consensus buildPartial() {
        tendermint.version.Types.Consensus result = new tendermint.version.Types.Consensus(this);
        result.block_ = block_;
        result.app_ = app_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof tendermint.version.Types.Consensus) {
          return mergeFrom((tendermint.version.Types.Consensus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tendermint.version.Types.Consensus other) {
        if (other == tendermint.version.Types.Consensus.getDefaultInstance()) return this;
        if (other.getBlock() != 0L) {
          setBlock(other.getBlock());
        }
        if (other.getApp() != 0L) {
          setApp(other.getApp());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        tendermint.version.Types.Consensus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (tendermint.version.Types.Consensus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long block_ ;
      /**
       * <code>optional uint64 block = 1;</code>
       */
      public long getBlock() {
        return block_;
      }
      /**
       * <code>optional uint64 block = 1;</code>
       */
      public Builder setBlock(long value) {
        
        block_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 block = 1;</code>
       */
      public Builder clearBlock() {
        
        block_ = 0L;
        onChanged();
        return this;
      }

      private long app_ ;
      /**
       * <code>optional uint64 app = 2;</code>
       */
      public long getApp() {
        return app_;
      }
      /**
       * <code>optional uint64 app = 2;</code>
       */
      public Builder setApp(long value) {
        
        app_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 app = 2;</code>
       */
      public Builder clearApp() {
        
        app_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:tendermint.version.Consensus)
    }

    // @@protoc_insertion_point(class_scope:tendermint.version.Consensus)
    private static final tendermint.version.Types.Consensus DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tendermint.version.Types.Consensus();
    }

    public static tendermint.version.Types.Consensus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Consensus>
        PARSER = new com.google.protobuf.AbstractParser<Consensus>() {
      public Consensus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Consensus(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Consensus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Consensus> getParserForType() {
      return PARSER;
    }

    public tendermint.version.Types.Consensus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_version_App_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_version_App_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_version_Consensus_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_version_Consensus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036tendermint/version/types.proto\022\022tender" +
      "mint.version\032\024gogoproto/gogo.proto\")\n\003Ap" +
      "p\022\020\n\010protocol\030\001 \001(\004\022\020\n\010software\030\002 \001(\t\"-\n" +
      "\tConsensus\022\r\n\005block\030\001 \001(\004\022\013\n\003app\030\002 \001(\004:\004" +
      "\350\240\037\001B;Z9github.com/tendermint/tendermint" +
      "/proto/tendermint/versionb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        }, assigner);
    internal_static_tendermint_version_App_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tendermint_version_App_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_version_App_descriptor,
        new java.lang.String[] { "Protocol", "Software", });
    internal_static_tendermint_version_Consensus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tendermint_version_Consensus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_version_Consensus_descriptor,
        new java.lang.String[] { "Block", "App", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equal);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}