// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MichiaeMatsuriDarkPressureLevelUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass {
  private MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MichiaeMatsuriDarkPressureLevelUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MichiaeMatsuriDarkPressureLevelUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dark_pressure_level = 1;</code>
     * @return The darkPressureLevel.
     */
    int getDarkPressureLevel();
  }
  /**
   * <pre>
   * CmdId: 8677
   * Obf: BMOFCFPGHPI
   * </pre>
   *
   * Protobuf type {@code MichiaeMatsuriDarkPressureLevelUpdateNotify}
   */
  public static final class MichiaeMatsuriDarkPressureLevelUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MichiaeMatsuriDarkPressureLevelUpdateNotify)
      MichiaeMatsuriDarkPressureLevelUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MichiaeMatsuriDarkPressureLevelUpdateNotify.newBuilder() to construct.
    private MichiaeMatsuriDarkPressureLevelUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MichiaeMatsuriDarkPressureLevelUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MichiaeMatsuriDarkPressureLevelUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MichiaeMatsuriDarkPressureLevelUpdateNotify(
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

              darkPressureLevel_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.internal_static_MichiaeMatsuriDarkPressureLevelUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.internal_static_MichiaeMatsuriDarkPressureLevelUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify.class, emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify.Builder.class);
    }

    public static final int DARK_PRESSURE_LEVEL_FIELD_NUMBER = 1;
    private int darkPressureLevel_;
    /**
     * <code>uint32 dark_pressure_level = 1;</code>
     * @return The darkPressureLevel.
     */
    @java.lang.Override
    public int getDarkPressureLevel() {
      return darkPressureLevel_;
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
      if (darkPressureLevel_ != 0) {
        output.writeUInt32(1, darkPressureLevel_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (darkPressureLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, darkPressureLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify other = (emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify) obj;

      if (getDarkPressureLevel()
          != other.getDarkPressureLevel()) return false;
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
      hash = (37 * hash) + DARK_PRESSURE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getDarkPressureLevel();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify prototype) {
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
     * CmdId: 8677
     * Obf: BMOFCFPGHPI
     * </pre>
     *
     * Protobuf type {@code MichiaeMatsuriDarkPressureLevelUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MichiaeMatsuriDarkPressureLevelUpdateNotify)
        emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.internal_static_MichiaeMatsuriDarkPressureLevelUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.internal_static_MichiaeMatsuriDarkPressureLevelUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify.class, emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify.newBuilder()
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
        darkPressureLevel_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.internal_static_MichiaeMatsuriDarkPressureLevelUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify build() {
        emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify result = new emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify(this);
        result.darkPressureLevel_ = darkPressureLevel_;
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
        if (other instanceof emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify.getDefaultInstance()) return this;
        if (other.getDarkPressureLevel() != 0) {
          setDarkPressureLevel(other.getDarkPressureLevel());
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
        emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int darkPressureLevel_ ;
      /**
       * <code>uint32 dark_pressure_level = 1;</code>
       * @return The darkPressureLevel.
       */
      @java.lang.Override
      public int getDarkPressureLevel() {
        return darkPressureLevel_;
      }
      /**
       * <code>uint32 dark_pressure_level = 1;</code>
       * @param value The darkPressureLevel to set.
       * @return This builder for chaining.
       */
      public Builder setDarkPressureLevel(int value) {
        
        darkPressureLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dark_pressure_level = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDarkPressureLevel() {
        
        darkPressureLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MichiaeMatsuriDarkPressureLevelUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:MichiaeMatsuriDarkPressureLevelUpdateNotify)
    private static final emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify();
    }

    public static emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MichiaeMatsuriDarkPressureLevelUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<MichiaeMatsuriDarkPressureLevelUpdateNotify>() {
      @java.lang.Override
      public MichiaeMatsuriDarkPressureLevelUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MichiaeMatsuriDarkPressureLevelUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MichiaeMatsuriDarkPressureLevelUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MichiaeMatsuriDarkPressureLevelUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MichiaeMatsuriDarkPressureLevelUpdateNotifyOuterClass.MichiaeMatsuriDarkPressureLevelUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MichiaeMatsuriDarkPressureLevelUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MichiaeMatsuriDarkPressureLevelUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1MichiaeMatsuriDarkPressureLevelUpdateN" +
      "otify.proto\"J\n+MichiaeMatsuriDarkPressur" +
      "eLevelUpdateNotify\022\033\n\023dark_pressure_leve" +
      "l\030\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MichiaeMatsuriDarkPressureLevelUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MichiaeMatsuriDarkPressureLevelUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MichiaeMatsuriDarkPressureLevelUpdateNotify_descriptor,
        new java.lang.String[] { "DarkPressureLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
