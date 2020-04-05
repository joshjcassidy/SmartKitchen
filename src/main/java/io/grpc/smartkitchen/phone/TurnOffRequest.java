// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: phone.proto

package io.grpc.smartkitchen.phone;

/**
 * Protobuf type {@code TurnOffRequest}
 */
public  final class TurnOffRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TurnOffRequest)
    TurnOffRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TurnOffRequest.newBuilder() to construct.
  private TurnOffRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TurnOffRequest() {
    turnOffHeat_ = "";
    turnOffOven_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TurnOffRequest(
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

            turnOffHeat_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            turnOffOven_ = s;
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
    return io.grpc.smartkitchen.phone.Phone.internal_static_TurnOffRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.smartkitchen.phone.Phone.internal_static_TurnOffRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.smartkitchen.phone.TurnOffRequest.class, io.grpc.smartkitchen.phone.TurnOffRequest.Builder.class);
  }

  public static final int TURNOFFHEAT_FIELD_NUMBER = 1;
  private volatile java.lang.Object turnOffHeat_;
  /**
   * <code>string turnOffHeat = 1;</code>
   */
  public java.lang.String getTurnOffHeat() {
    java.lang.Object ref = turnOffHeat_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      turnOffHeat_ = s;
      return s;
    }
  }
  /**
   * <code>string turnOffHeat = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTurnOffHeatBytes() {
    java.lang.Object ref = turnOffHeat_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      turnOffHeat_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TURNOFFOVEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object turnOffOven_;
  /**
   * <code>string turnOffOven = 2;</code>
   */
  public java.lang.String getTurnOffOven() {
    java.lang.Object ref = turnOffOven_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      turnOffOven_ = s;
      return s;
    }
  }
  /**
   * <code>string turnOffOven = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTurnOffOvenBytes() {
    java.lang.Object ref = turnOffOven_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      turnOffOven_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getTurnOffHeatBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, turnOffHeat_);
    }
    if (!getTurnOffOvenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, turnOffOven_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTurnOffHeatBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, turnOffHeat_);
    }
    if (!getTurnOffOvenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, turnOffOven_);
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
    if (!(obj instanceof io.grpc.smartkitchen.phone.TurnOffRequest)) {
      return super.equals(obj);
    }
    io.grpc.smartkitchen.phone.TurnOffRequest other = (io.grpc.smartkitchen.phone.TurnOffRequest) obj;

    boolean result = true;
    result = result && getTurnOffHeat()
        .equals(other.getTurnOffHeat());
    result = result && getTurnOffOven()
        .equals(other.getTurnOffOven());
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
    hash = (37 * hash) + TURNOFFHEAT_FIELD_NUMBER;
    hash = (53 * hash) + getTurnOffHeat().hashCode();
    hash = (37 * hash) + TURNOFFOVEN_FIELD_NUMBER;
    hash = (53 * hash) + getTurnOffOven().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.smartkitchen.phone.TurnOffRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.smartkitchen.phone.TurnOffRequest parseFrom(
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
  public static Builder newBuilder(io.grpc.smartkitchen.phone.TurnOffRequest prototype) {
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
   * Protobuf type {@code TurnOffRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TurnOffRequest)
      io.grpc.smartkitchen.phone.TurnOffRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.smartkitchen.phone.Phone.internal_static_TurnOffRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.smartkitchen.phone.Phone.internal_static_TurnOffRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.smartkitchen.phone.TurnOffRequest.class, io.grpc.smartkitchen.phone.TurnOffRequest.Builder.class);
    }

    // Construct using io.grpc.smartkitchen.phone.TurnOffRequest.newBuilder()
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
      turnOffHeat_ = "";

      turnOffOven_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.smartkitchen.phone.Phone.internal_static_TurnOffRequest_descriptor;
    }

    @java.lang.Override
    public io.grpc.smartkitchen.phone.TurnOffRequest getDefaultInstanceForType() {
      return io.grpc.smartkitchen.phone.TurnOffRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.smartkitchen.phone.TurnOffRequest build() {
      io.grpc.smartkitchen.phone.TurnOffRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.smartkitchen.phone.TurnOffRequest buildPartial() {
      io.grpc.smartkitchen.phone.TurnOffRequest result = new io.grpc.smartkitchen.phone.TurnOffRequest(this);
      result.turnOffHeat_ = turnOffHeat_;
      result.turnOffOven_ = turnOffOven_;
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
      if (other instanceof io.grpc.smartkitchen.phone.TurnOffRequest) {
        return mergeFrom((io.grpc.smartkitchen.phone.TurnOffRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.smartkitchen.phone.TurnOffRequest other) {
      if (other == io.grpc.smartkitchen.phone.TurnOffRequest.getDefaultInstance()) return this;
      if (!other.getTurnOffHeat().isEmpty()) {
        turnOffHeat_ = other.turnOffHeat_;
        onChanged();
      }
      if (!other.getTurnOffOven().isEmpty()) {
        turnOffOven_ = other.turnOffOven_;
        onChanged();
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
      io.grpc.smartkitchen.phone.TurnOffRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.smartkitchen.phone.TurnOffRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object turnOffHeat_ = "";
    /**
     * <code>string turnOffHeat = 1;</code>
     */
    public java.lang.String getTurnOffHeat() {
      java.lang.Object ref = turnOffHeat_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        turnOffHeat_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string turnOffHeat = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTurnOffHeatBytes() {
      java.lang.Object ref = turnOffHeat_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        turnOffHeat_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string turnOffHeat = 1;</code>
     */
    public Builder setTurnOffHeat(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      turnOffHeat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string turnOffHeat = 1;</code>
     */
    public Builder clearTurnOffHeat() {
      
      turnOffHeat_ = getDefaultInstance().getTurnOffHeat();
      onChanged();
      return this;
    }
    /**
     * <code>string turnOffHeat = 1;</code>
     */
    public Builder setTurnOffHeatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      turnOffHeat_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object turnOffOven_ = "";
    /**
     * <code>string turnOffOven = 2;</code>
     */
    public java.lang.String getTurnOffOven() {
      java.lang.Object ref = turnOffOven_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        turnOffOven_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string turnOffOven = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTurnOffOvenBytes() {
      java.lang.Object ref = turnOffOven_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        turnOffOven_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string turnOffOven = 2;</code>
     */
    public Builder setTurnOffOven(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      turnOffOven_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string turnOffOven = 2;</code>
     */
    public Builder clearTurnOffOven() {
      
      turnOffOven_ = getDefaultInstance().getTurnOffOven();
      onChanged();
      return this;
    }
    /**
     * <code>string turnOffOven = 2;</code>
     */
    public Builder setTurnOffOvenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      turnOffOven_ = value;
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


    // @@protoc_insertion_point(builder_scope:TurnOffRequest)
  }

  // @@protoc_insertion_point(class_scope:TurnOffRequest)
  private static final io.grpc.smartkitchen.phone.TurnOffRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.smartkitchen.phone.TurnOffRequest();
  }

  public static io.grpc.smartkitchen.phone.TurnOffRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TurnOffRequest>
      PARSER = new com.google.protobuf.AbstractParser<TurnOffRequest>() {
    @java.lang.Override
    public TurnOffRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TurnOffRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TurnOffRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TurnOffRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.smartkitchen.phone.TurnOffRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

