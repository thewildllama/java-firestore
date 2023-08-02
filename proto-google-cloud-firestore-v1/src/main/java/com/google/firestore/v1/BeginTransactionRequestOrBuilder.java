/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

package com.google.firestore.v1;

public interface BeginTransactionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.BeginTransactionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The database.
   */
  java.lang.String getDatabase();
  /**
   *
   *
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for database.
   */
  com.google.protobuf.ByteString getDatabaseBytes();

  /**
   *
   *
   * <pre>
   * The options for the transaction.
   * Defaults to a read-write transaction.
   * </pre>
   *
   * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
   *
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   *
   *
   * <pre>
   * The options for the transaction.
   * Defaults to a read-write transaction.
   * </pre>
   *
   * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
   *
   * @return The options.
   */
  com.google.firestore.v1.TransactionOptions getOptions();
  /**
   *
   *
   * <pre>
   * The options for the transaction.
   * Defaults to a read-write transaction.
   * </pre>
   *
   * <code>.google.firestore.v1.TransactionOptions options = 2;</code>
   */
  com.google.firestore.v1.TransactionOptionsOrBuilder getOptionsOrBuilder();
}
