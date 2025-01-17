// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CCDOMGKFBHB.proto

package emu.grasscutter.net.proto;

public final class CCDOMGKFBHBOuterClass {
  private CCDOMGKFBHBOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CCDOMGKFBHBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CCDOMGKFBHB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 BEPPPMFAFJA = 10;</code>
     * @return The bEPPPMFAFJA.
     */
    int getBEPPPMFAFJA();
  }
  /**
   * <pre>
   * CmdId: 9139
   * </pre>
   *
   * Protobuf type {@code CCDOMGKFBHB}
   */
  public static final class CCDOMGKFBHB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CCDOMGKFBHB)
      CCDOMGKFBHBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CCDOMGKFBHB.newBuilder() to construct.
    private CCDOMGKFBHB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CCDOMGKFBHB() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CCDOMGKFBHB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CCDOMGKFBHB(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              entityId_ = input.readUInt32();
              break;
            }
            case 80: {

              bEPPPMFAFJA_ = input.readUInt32();
              break;
            }
            case 96: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.internal_static_CCDOMGKFBHB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.internal_static_CCDOMGKFBHB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB.class, emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int BEPPPMFAFJA_FIELD_NUMBER = 10;
    private int bEPPPMFAFJA_;
    /**
     * <code>uint32 BEPPPMFAFJA = 10;</code>
     * @return The bEPPPMFAFJA.
     */
    @java.lang.Override
    public int getBEPPPMFAFJA() {
      return bEPPPMFAFJA_;
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
      if (entityId_ != 0) {
        output.writeUInt32(1, entityId_);
      }
      if (bEPPPMFAFJA_ != 0) {
        output.writeUInt32(10, bEPPPMFAFJA_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityId_);
      }
      if (bEPPPMFAFJA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, bEPPPMFAFJA_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB other = (emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getBEPPPMFAFJA()
          != other.getBEPPPMFAFJA()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + BEPPPMFAFJA_FIELD_NUMBER;
      hash = (53 * hash) + getBEPPPMFAFJA();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB prototype) {
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
     * <pre>
     * CmdId: 9139
     * </pre>
     *
     * Protobuf type {@code CCDOMGKFBHB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CCDOMGKFBHB)
        emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.internal_static_CCDOMGKFBHB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.internal_static_CCDOMGKFBHB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB.class, emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB.newBuilder()
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
        entityId_ = 0;

        retcode_ = 0;

        bEPPPMFAFJA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.internal_static_CCDOMGKFBHB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB build() {
        emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB buildPartial() {
        emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB result = new emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB(this);
        result.entityId_ = entityId_;
        result.retcode_ = retcode_;
        result.bEPPPMFAFJA_ = bEPPPMFAFJA_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB) {
          return mergeFrom((emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB other) {
        if (other == emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getBEPPPMFAFJA() != 0) {
          setBEPPPMFAFJA(other.getBEPPPMFAFJA());
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
        emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int bEPPPMFAFJA_ ;
      /**
       * <code>uint32 BEPPPMFAFJA = 10;</code>
       * @return The bEPPPMFAFJA.
       */
      @java.lang.Override
      public int getBEPPPMFAFJA() {
        return bEPPPMFAFJA_;
      }
      /**
       * <code>uint32 BEPPPMFAFJA = 10;</code>
       * @param value The bEPPPMFAFJA to set.
       * @return This builder for chaining.
       */
      public Builder setBEPPPMFAFJA(int value) {
        
        bEPPPMFAFJA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BEPPPMFAFJA = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBEPPPMFAFJA() {
        
        bEPPPMFAFJA_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CCDOMGKFBHB)
    }

    // @@protoc_insertion_point(class_scope:CCDOMGKFBHB)
    private static final emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB();
    }

    public static emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CCDOMGKFBHB>
        PARSER = new com.google.protobuf.AbstractParser<CCDOMGKFBHB>() {
      @java.lang.Override
      public CCDOMGKFBHB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CCDOMGKFBHB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CCDOMGKFBHB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CCDOMGKFBHB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CCDOMGKFBHBOuterClass.CCDOMGKFBHB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CCDOMGKFBHB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CCDOMGKFBHB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CCDOMGKFBHB.proto\"F\n\013CCDOMGKFBHB\022\021\n\ten" +
      "tity_id\030\001 \001(\r\022\017\n\007retcode\030\014 \001(\005\022\023\n\013BEPPPM" +
      "FAFJA\030\n \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CCDOMGKFBHB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CCDOMGKFBHB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CCDOMGKFBHB_descriptor,
        new java.lang.String[] { "EntityId", "Retcode", "BEPPPMFAFJA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
