// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: phone.proto

package io.grpc.smartkitchen.phone;

/**
 * Protobuf type {@code PreheatResponse}
 */
public  final class PreheatResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PreheatResponse)
    PreheatResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PreheatResponse.newBuilder() to construct.
  private PreheatResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PreheatResponse() {
    ovenSettingSelected_ = "";
    heatSelected_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PreheatResponse(
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

            ovenSettingSelected_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            heatSelected_ = s;
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
    return io.grpc.smartkitchen.phone.Phone.internal_static_PreheatResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.smartkitchen.phone.Phone.internal_static_PreheatResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.smartkitchen.phone.PreheatResponse.class, io.grpc.smartkitchen.phone.PreheatResponse.Builder.class);
  }

  public static final int OVENSETTINGSELECTED_FIELD_NUMBER = 1;
  private volatile java.lang.Object ovenSettingSelected_;
  /**
   * <code>string ovenSettingSelected = 1;</code>
   */
  public java.lang.String getOvenSettingSelected() {
    java.lang.Object ref = ovenSettingSelected_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ovenSettingSelected_ = s;
      return s;
    }
  }
  /**
   * <code>string ovenSettingSelected = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOvenSettingSelectedBytes() {
    java.lang.Object ref = ovenSettingSelected_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ovenSettingSelected_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEATSELECTED_FIELD_NUMBER = 2;
  private volatile java.lang.Object heatSelected_;
  /**
   * <code>string heatSelected = 2;</code>
   */
  public java.lang.String getHeatSelected() {
    java.lang.Object ref = heatSelected_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      heatSelected_ = s;
      return s;
    }
  }
  /**
   * <code>string heatSelected = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHeatSelectedBytes() {
    java.lang.Object ref = heatSelected_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      heatSelected_ = b;
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
    if (!getOvenSettingSelectedBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ovenSettingSelected_);
    }
    if (!getHeatSelectedBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, heatSelected_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOvenSettingSelectedBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ovenSettingSelected_);
    }
    if (!getHeatSelectedBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, heatSelected_);
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
    if (!(obj instanceof io.grpc.smartkitchen.phone.PreheatResponse)) {
      return super.equals(obj);
    }
    io.grpc.smartkitchen.phone.PreheatResponse other = (io.grpc.smartkitchen.phone.PreheatResponse) obj;

    boolean result = true;
    result = result && getOvenSettingSelected()
        .equals(other.getOvenSettingSelected());
    result = result && getHeatSelected()
        .equals(other.getHeatSelected());
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
    hash = (37 * hash) + OVENSETTINGSELECTED_FIELD_NUMBER;
    hash = (53 * hash) + getOvenSettingSelected().hashCode();
    hash = (37 * hash) + HEATSELECTED_FIELD_NUMBER;
    hash = (53 * hash) + getHeatSelected().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.smartkitchen.phone.PreheatResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.smartkitchen.phone.PreheatResponse parseFrom(
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
  public static Builder newBuilder(io.grpc.smartkitchen.phone.PreheatResponse prototype) {
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
   * Protobuf type {@code PreheatResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PreheatResponse)
      io.grpc.smartkitchen.phone.PreheatResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.smartkitchen.phone.Phone.internal_static_PreheatResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.smartkitchen.phone.Phone.internal_static_PreheatResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.smartkitchen.phone.PreheatResponse.class, io.grpc.smartkitchen.phone.PreheatResponse.Builder.class);
    }

    // Construct using io.grpc.smartkitchen.phone.PreheatResponse.newBuilder()
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
      ovenSettingSelected_ = "";

      heatSelected_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.smartkitchen.phone.Phone.internal_static_PreheatResponse_descriptor;
    }

    @java.lang.Override
    public io.grpc.smartkitchen.phone.PreheatResponse getDefaultInstanceForType() {
      return io.grpc.smartkitchen.phone.PreheatResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.smartkitchen.phone.PreheatResponse build() {
      io.grpc.smartkitchen.phone.PreheatResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.smartkitchen.phone.PreheatResponse buildPartial() {
      io.grpc.smartkitchen.phone.PreheatResponse result = new io.grpc.smartkitchen.phone.PreheatResponse(this);
      result.ovenSettingSelected_ = ovenSettingSelected_;
      result.heatSelected_ = heatSelected_;
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
      if (other instanceof io.grpc.smartkitchen.phone.PreheatResponse) {
        return mergeFrom((io.grpc.smartkitchen.phone.PreheatResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.smartkitchen.phone.PreheatResponse other) {
      if (other == io.grpc.smartkitchen.phone.PreheatResponse.getDefaultInstance()) return this;
      if (!other.getOvenSettingSelected().isEmpty()) {
        ovenSettingSelected_ = other.ovenSettingSelected_;
        onChanged();
      }
      if (!other.getHeatSelected().isEmpty()) {
        heatSelected_ = other.heatSelected_;
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
      io.grpc.smartkitchen.phone.PreheatResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.smartkitchen.phone.PreheatResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ovenSettingSelected_ = "";
    /**
     * <code>string ovenSettingSelected = 1;</code>
     */
    public java.lang.String getOvenSettingSelected() {
      java.lang.Object ref = ovenSettingSelected_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ovenSettingSelected_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ovenSettingSelected = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOvenSettingSelectedBytes() {
      java.lang.Object ref = ovenSettingSelected_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ovenSettingSelected_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ovenSettingSelected = 1;</code>
     */
    public Builder setOvenSettingSelected(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ovenSettingSelected_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ovenSettingSelected = 1;</code>
     */
    public Builder clearOvenSettingSelected() {
      
      ovenSettingSelected_ = getDefaultInstance().getOvenSettingSelected();
      onChanged();
      return this;
    }
    /**
     * <code>string ovenSettingSelected = 1;</code>
     */
    public Builder setOvenSettingSelectedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ovenSettingSelected_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object heatSelected_ = "";
    /**
     * <code>string heatSelected = 2;</code>
     */
    public java.lang.String getHeatSelected() {
      java.lang.Object ref = heatSelected_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        heatSelected_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string heatSelected = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHeatSelectedBytes() {
      java.lang.Object ref = heatSelected_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        heatSelected_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string heatSelected = 2;</code>
     */
    public Builder setHeatSelected(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      heatSelected_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string heatSelected = 2;</code>
     */
    public Builder clearHeatSelected() {
      
      heatSelected_ = getDefaultInstance().getHeatSelected();
      onChanged();
      return this;
    }
    /**
     * <code>string heatSelected = 2;</code>
     */
    public Builder setHeatSelectedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      heatSelected_ = value;
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


    // @@protoc_insertion_point(builder_scope:PreheatResponse)
  }

  // @@protoc_insertion_point(class_scope:PreheatResponse)
  private static final io.grpc.smartkitchen.phone.PreheatResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.smartkitchen.phone.PreheatResponse();
  }

  public static io.grpc.smartkitchen.phone.PreheatResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreheatResponse>
      PARSER = new com.google.protobuf.AbstractParser<PreheatResponse>() {
    @java.lang.Override
    public PreheatResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PreheatResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PreheatResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreheatResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.smartkitchen.phone.PreheatResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

