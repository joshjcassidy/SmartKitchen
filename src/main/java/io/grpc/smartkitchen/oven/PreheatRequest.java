// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oven.proto

package io.grpc.smartkitchen.oven;

/**
 * Protobuf type {@code PreheatRequest}
 */
public  final class PreheatRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PreheatRequest)
    PreheatRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PreheatRequest.newBuilder() to construct.
  private PreheatRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PreheatRequest() {
    setting_ = "";
    heat_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PreheatRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            setting_ = s;
            break;
          }
          case 16: {

            heat_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.smartkitchen.oven.Oven.internal_static_PreheatRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.smartkitchen.oven.Oven.internal_static_PreheatRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.smartkitchen.oven.PreheatRequest.class, io.grpc.smartkitchen.oven.PreheatRequest.Builder.class);
  }

  public static final int SETTING_FIELD_NUMBER = 1;
  private volatile java.lang.Object setting_;
  /**
   * <pre>
   *setting number of responses we want returned from client
   * </pre>
   *
   * <code>string setting = 1;</code>
   */
  public java.lang.String getSetting() {
    java.lang.Object ref = setting_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      setting_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *setting number of responses we want returned from client
   * </pre>
   *
   * <code>string setting = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSettingBytes() {
    java.lang.Object ref = setting_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      setting_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEAT_FIELD_NUMBER = 2;
  private int heat_;
  /**
   * <code>int32 heat = 2;</code>
   */
  public int getHeat() {
    return heat_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSettingBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, setting_);
    }
    if (heat_ != 0) {
      output.writeInt32(2, heat_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSettingBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, setting_);
    }
    if (heat_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, heat_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.smartkitchen.oven.PreheatRequest)) {
      return super.equals(obj);
    }
    io.grpc.smartkitchen.oven.PreheatRequest other = (io.grpc.smartkitchen.oven.PreheatRequest) obj;

    boolean result = true;
    result = result && getSetting()
        .equals(other.getSetting());
    result = result && (getHeat()
        == other.getHeat());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SETTING_FIELD_NUMBER;
    hash = (53 * hash) + getSetting().hashCode();
    hash = (37 * hash) + HEAT_FIELD_NUMBER;
    hash = (53 * hash) + getHeat();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.smartkitchen.oven.PreheatRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.smartkitchen.oven.PreheatRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.smartkitchen.oven.PreheatRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code PreheatRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PreheatRequest)
      io.grpc.smartkitchen.oven.PreheatRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.smartkitchen.oven.Oven.internal_static_PreheatRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.smartkitchen.oven.Oven.internal_static_PreheatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.smartkitchen.oven.PreheatRequest.class, io.grpc.smartkitchen.oven.PreheatRequest.Builder.class);
    }

    // Construct using io.grpc.smartkitchen.oven.PreheatRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      setting_ = "";

      heat_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.smartkitchen.oven.Oven.internal_static_PreheatRequest_descriptor;
    }

    @java.lang.Override
    public io.grpc.smartkitchen.oven.PreheatRequest getDefaultInstanceForType() {
      return io.grpc.smartkitchen.oven.PreheatRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.smartkitchen.oven.PreheatRequest build() {
      io.grpc.smartkitchen.oven.PreheatRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.smartkitchen.oven.PreheatRequest buildPartial() {
      io.grpc.smartkitchen.oven.PreheatRequest result = new io.grpc.smartkitchen.oven.PreheatRequest(this);
      result.setting_ = setting_;
      result.heat_ = heat_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.smartkitchen.oven.PreheatRequest) {
        return mergeFrom((io.grpc.smartkitchen.oven.PreheatRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.smartkitchen.oven.PreheatRequest other) {
      if (other == io.grpc.smartkitchen.oven.PreheatRequest.getDefaultInstance()) return this;
      if (!other.getSetting().isEmpty()) {
        setting_ = other.setting_;
        onChanged();
      }
      if (other.getHeat() != 0) {
        setHeat(other.getHeat());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.smartkitchen.oven.PreheatRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.smartkitchen.oven.PreheatRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object setting_ = "";
    /**
     * <pre>
     *setting number of responses we want returned from client
     * </pre>
     *
     * <code>string setting = 1;</code>
     */
    public java.lang.String getSetting() {
      java.lang.Object ref = setting_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        setting_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *setting number of responses we want returned from client
     * </pre>
     *
     * <code>string setting = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSettingBytes() {
      java.lang.Object ref = setting_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        setting_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *setting number of responses we want returned from client
     * </pre>
     *
     * <code>string setting = 1;</code>
     */
    public Builder setSetting(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      setting_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *setting number of responses we want returned from client
     * </pre>
     *
     * <code>string setting = 1;</code>
     */
    public Builder clearSetting() {
      
      setting_ = getDefaultInstance().getSetting();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *setting number of responses we want returned from client
     * </pre>
     *
     * <code>string setting = 1;</code>
     */
    public Builder setSettingBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      setting_ = value;
      onChanged();
      return this;
    }

    private int heat_ ;
    /**
     * <code>int32 heat = 2;</code>
     */
    public int getHeat() {
      return heat_;
    }
    /**
     * <code>int32 heat = 2;</code>
     */
    public Builder setHeat(int value) {
      
      heat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 heat = 2;</code>
     */
    public Builder clearHeat() {
      
      heat_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:PreheatRequest)
  }

  // @@protoc_insertion_point(class_scope:PreheatRequest)
  private static final io.grpc.smartkitchen.oven.PreheatRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.smartkitchen.oven.PreheatRequest();
  }

  public static io.grpc.smartkitchen.oven.PreheatRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreheatRequest>
      PARSER = new com.google.protobuf.AbstractParser<PreheatRequest>() {
    @java.lang.Override
    public PreheatRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PreheatRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PreheatRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreheatRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.smartkitchen.oven.PreheatRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

