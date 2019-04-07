// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: node.proto

package org.iotexproject.antenna.grpc.iotextypes;

public final class Node {
  private Node() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerMetaOrBuilder extends
      // @@protoc_insertion_point(interface_extends:iotextypes.ServerMeta)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string packageVersion = 1;</code>
     */
    java.lang.String getPackageVersion();
    /**
     * <code>string packageVersion = 1;</code>
     */
    com.google.protobuf.ByteString
        getPackageVersionBytes();

    /**
     * <code>string packageCommitID = 2;</code>
     */
    java.lang.String getPackageCommitID();
    /**
     * <code>string packageCommitID = 2;</code>
     */
    com.google.protobuf.ByteString
        getPackageCommitIDBytes();

    /**
     * <code>string gitStatus = 3;</code>
     */
    java.lang.String getGitStatus();
    /**
     * <code>string gitStatus = 3;</code>
     */
    com.google.protobuf.ByteString
        getGitStatusBytes();

    /**
     * <code>string goVersion = 4;</code>
     */
    java.lang.String getGoVersion();
    /**
     * <code>string goVersion = 4;</code>
     */
    com.google.protobuf.ByteString
        getGoVersionBytes();

    /**
     * <code>string buildTime = 5;</code>
     */
    java.lang.String getBuildTime();
    /**
     * <code>string buildTime = 5;</code>
     */
    com.google.protobuf.ByteString
        getBuildTimeBytes();
  }
  /**
   * <pre>
   * Server Metadata
   * </pre>
   *
   * Protobuf type {@code iotextypes.ServerMeta}
   */
  public  static final class ServerMeta extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:iotextypes.ServerMeta)
      ServerMetaOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerMeta.newBuilder() to construct.
    private ServerMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerMeta() {
      packageVersion_ = "";
      packageCommitID_ = "";
      gitStatus_ = "";
      goVersion_ = "";
      buildTime_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServerMeta(
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

              packageVersion_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              packageCommitID_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              gitStatus_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              goVersion_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              buildTime_ = s;
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
      return org.iotexproject.antenna.grpc.iotextypes.Node.internal_static_iotextypes_ServerMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.iotexproject.antenna.grpc.iotextypes.Node.internal_static_iotextypes_ServerMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta.class, org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta.Builder.class);
    }

    public static final int PACKAGEVERSION_FIELD_NUMBER = 1;
    private volatile java.lang.Object packageVersion_;
    /**
     * <code>string packageVersion = 1;</code>
     */
    public java.lang.String getPackageVersion() {
      java.lang.Object ref = packageVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packageVersion_ = s;
        return s;
      }
    }
    /**
     * <code>string packageVersion = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPackageVersionBytes() {
      java.lang.Object ref = packageVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        packageVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PACKAGECOMMITID_FIELD_NUMBER = 2;
    private volatile java.lang.Object packageCommitID_;
    /**
     * <code>string packageCommitID = 2;</code>
     */
    public java.lang.String getPackageCommitID() {
      java.lang.Object ref = packageCommitID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packageCommitID_ = s;
        return s;
      }
    }
    /**
     * <code>string packageCommitID = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPackageCommitIDBytes() {
      java.lang.Object ref = packageCommitID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        packageCommitID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GITSTATUS_FIELD_NUMBER = 3;
    private volatile java.lang.Object gitStatus_;
    /**
     * <code>string gitStatus = 3;</code>
     */
    public java.lang.String getGitStatus() {
      java.lang.Object ref = gitStatus_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gitStatus_ = s;
        return s;
      }
    }
    /**
     * <code>string gitStatus = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGitStatusBytes() {
      java.lang.Object ref = gitStatus_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gitStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GOVERSION_FIELD_NUMBER = 4;
    private volatile java.lang.Object goVersion_;
    /**
     * <code>string goVersion = 4;</code>
     */
    public java.lang.String getGoVersion() {
      java.lang.Object ref = goVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        goVersion_ = s;
        return s;
      }
    }
    /**
     * <code>string goVersion = 4;</code>
     */
    public com.google.protobuf.ByteString
        getGoVersionBytes() {
      java.lang.Object ref = goVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        goVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BUILDTIME_FIELD_NUMBER = 5;
    private volatile java.lang.Object buildTime_;
    /**
     * <code>string buildTime = 5;</code>
     */
    public java.lang.String getBuildTime() {
      java.lang.Object ref = buildTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buildTime_ = s;
        return s;
      }
    }
    /**
     * <code>string buildTime = 5;</code>
     */
    public com.google.protobuf.ByteString
        getBuildTimeBytes() {
      java.lang.Object ref = buildTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buildTime_ = b;
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
      if (!getPackageVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, packageVersion_);
      }
      if (!getPackageCommitIDBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, packageCommitID_);
      }
      if (!getGitStatusBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gitStatus_);
      }
      if (!getGoVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, goVersion_);
      }
      if (!getBuildTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, buildTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getPackageVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, packageVersion_);
      }
      if (!getPackageCommitIDBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, packageCommitID_);
      }
      if (!getGitStatusBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gitStatus_);
      }
      if (!getGoVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, goVersion_);
      }
      if (!getBuildTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, buildTime_);
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
      if (!(obj instanceof org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta)) {
        return super.equals(obj);
      }
      org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta other = (org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta) obj;

      if (!getPackageVersion()
          .equals(other.getPackageVersion())) return false;
      if (!getPackageCommitID()
          .equals(other.getPackageCommitID())) return false;
      if (!getGitStatus()
          .equals(other.getGitStatus())) return false;
      if (!getGoVersion()
          .equals(other.getGoVersion())) return false;
      if (!getBuildTime()
          .equals(other.getBuildTime())) return false;
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
      hash = (37 * hash) + PACKAGEVERSION_FIELD_NUMBER;
      hash = (53 * hash) + getPackageVersion().hashCode();
      hash = (37 * hash) + PACKAGECOMMITID_FIELD_NUMBER;
      hash = (53 * hash) + getPackageCommitID().hashCode();
      hash = (37 * hash) + GITSTATUS_FIELD_NUMBER;
      hash = (53 * hash) + getGitStatus().hashCode();
      hash = (37 * hash) + GOVERSION_FIELD_NUMBER;
      hash = (53 * hash) + getGoVersion().hashCode();
      hash = (37 * hash) + BUILDTIME_FIELD_NUMBER;
      hash = (53 * hash) + getBuildTime().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parseFrom(
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
    public static Builder newBuilder(org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta prototype) {
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
     * Server Metadata
     * </pre>
     *
     * Protobuf type {@code iotextypes.ServerMeta}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:iotextypes.ServerMeta)
        org.iotexproject.antenna.grpc.iotextypes.Node.ServerMetaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.iotexproject.antenna.grpc.iotextypes.Node.internal_static_iotextypes_ServerMeta_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.iotexproject.antenna.grpc.iotextypes.Node.internal_static_iotextypes_ServerMeta_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta.class, org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta.Builder.class);
      }

      // Construct using org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta.newBuilder()
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
        packageVersion_ = "";

        packageCommitID_ = "";

        gitStatus_ = "";

        goVersion_ = "";

        buildTime_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.iotexproject.antenna.grpc.iotextypes.Node.internal_static_iotextypes_ServerMeta_descriptor;
      }

      @java.lang.Override
      public org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta getDefaultInstanceForType() {
        return org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta.getDefaultInstance();
      }

      @java.lang.Override
      public org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta build() {
        org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta buildPartial() {
        org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta result = new org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta(this);
        result.packageVersion_ = packageVersion_;
        result.packageCommitID_ = packageCommitID_;
        result.gitStatus_ = gitStatus_;
        result.goVersion_ = goVersion_;
        result.buildTime_ = buildTime_;
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
        if (other instanceof org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta) {
          return mergeFrom((org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta other) {
        if (other == org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta.getDefaultInstance()) return this;
        if (!other.getPackageVersion().isEmpty()) {
          packageVersion_ = other.packageVersion_;
          onChanged();
        }
        if (!other.getPackageCommitID().isEmpty()) {
          packageCommitID_ = other.packageCommitID_;
          onChanged();
        }
        if (!other.getGitStatus().isEmpty()) {
          gitStatus_ = other.gitStatus_;
          onChanged();
        }
        if (!other.getGoVersion().isEmpty()) {
          goVersion_ = other.goVersion_;
          onChanged();
        }
        if (!other.getBuildTime().isEmpty()) {
          buildTime_ = other.buildTime_;
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
        org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object packageVersion_ = "";
      /**
       * <code>string packageVersion = 1;</code>
       */
      public java.lang.String getPackageVersion() {
        java.lang.Object ref = packageVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          packageVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string packageVersion = 1;</code>
       */
      public com.google.protobuf.ByteString
          getPackageVersionBytes() {
        java.lang.Object ref = packageVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          packageVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string packageVersion = 1;</code>
       */
      public Builder setPackageVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        packageVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string packageVersion = 1;</code>
       */
      public Builder clearPackageVersion() {
        
        packageVersion_ = getDefaultInstance().getPackageVersion();
        onChanged();
        return this;
      }
      /**
       * <code>string packageVersion = 1;</code>
       */
      public Builder setPackageVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        packageVersion_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object packageCommitID_ = "";
      /**
       * <code>string packageCommitID = 2;</code>
       */
      public java.lang.String getPackageCommitID() {
        java.lang.Object ref = packageCommitID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          packageCommitID_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string packageCommitID = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPackageCommitIDBytes() {
        java.lang.Object ref = packageCommitID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          packageCommitID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string packageCommitID = 2;</code>
       */
      public Builder setPackageCommitID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        packageCommitID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string packageCommitID = 2;</code>
       */
      public Builder clearPackageCommitID() {
        
        packageCommitID_ = getDefaultInstance().getPackageCommitID();
        onChanged();
        return this;
      }
      /**
       * <code>string packageCommitID = 2;</code>
       */
      public Builder setPackageCommitIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        packageCommitID_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object gitStatus_ = "";
      /**
       * <code>string gitStatus = 3;</code>
       */
      public java.lang.String getGitStatus() {
        java.lang.Object ref = gitStatus_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          gitStatus_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string gitStatus = 3;</code>
       */
      public com.google.protobuf.ByteString
          getGitStatusBytes() {
        java.lang.Object ref = gitStatus_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          gitStatus_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string gitStatus = 3;</code>
       */
      public Builder setGitStatus(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        gitStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string gitStatus = 3;</code>
       */
      public Builder clearGitStatus() {
        
        gitStatus_ = getDefaultInstance().getGitStatus();
        onChanged();
        return this;
      }
      /**
       * <code>string gitStatus = 3;</code>
       */
      public Builder setGitStatusBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        gitStatus_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object goVersion_ = "";
      /**
       * <code>string goVersion = 4;</code>
       */
      public java.lang.String getGoVersion() {
        java.lang.Object ref = goVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          goVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string goVersion = 4;</code>
       */
      public com.google.protobuf.ByteString
          getGoVersionBytes() {
        java.lang.Object ref = goVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          goVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string goVersion = 4;</code>
       */
      public Builder setGoVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        goVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string goVersion = 4;</code>
       */
      public Builder clearGoVersion() {
        
        goVersion_ = getDefaultInstance().getGoVersion();
        onChanged();
        return this;
      }
      /**
       * <code>string goVersion = 4;</code>
       */
      public Builder setGoVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        goVersion_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object buildTime_ = "";
      /**
       * <code>string buildTime = 5;</code>
       */
      public java.lang.String getBuildTime() {
        java.lang.Object ref = buildTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          buildTime_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string buildTime = 5;</code>
       */
      public com.google.protobuf.ByteString
          getBuildTimeBytes() {
        java.lang.Object ref = buildTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          buildTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string buildTime = 5;</code>
       */
      public Builder setBuildTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        buildTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string buildTime = 5;</code>
       */
      public Builder clearBuildTime() {
        
        buildTime_ = getDefaultInstance().getBuildTime();
        onChanged();
        return this;
      }
      /**
       * <code>string buildTime = 5;</code>
       */
      public Builder setBuildTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        buildTime_ = value;
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


      // @@protoc_insertion_point(builder_scope:iotextypes.ServerMeta)
    }

    // @@protoc_insertion_point(class_scope:iotextypes.ServerMeta)
    private static final org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta();
    }

    public static org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerMeta>
        PARSER = new com.google.protobuf.AbstractParser<ServerMeta>() {
      @java.lang.Override
      public ServerMeta parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerMeta(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerMeta> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerMeta> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.iotexproject.antenna.grpc.iotextypes.Node.ServerMeta getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_iotextypes_ServerMeta_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_iotextypes_ServerMeta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nnode.proto\022\niotextypes\"v\n\nServerMeta\022\026" +
      "\n\016packageVersion\030\001 \001(\t\022\027\n\017packageCommitI" +
      "D\030\002 \001(\t\022\021\n\tgitStatus\030\003 \001(\t\022\021\n\tgoVersion\030" +
      "\004 \001(\t\022\021\n\tbuildTime\030\005 \001(\tBb\n(org.iotexpro" +
      "ject.antenna.grpc.iotextypesZ6github.com" +
      "/iotexproject/iotex-core/protogen/iotext" +
      "ypesb\006proto3"
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
        }, assigner);
    internal_static_iotextypes_ServerMeta_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_iotextypes_ServerMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_iotextypes_ServerMeta_descriptor,
        new java.lang.String[] { "PackageVersion", "PackageCommitID", "GitStatus", "GoVersion", "BuildTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
