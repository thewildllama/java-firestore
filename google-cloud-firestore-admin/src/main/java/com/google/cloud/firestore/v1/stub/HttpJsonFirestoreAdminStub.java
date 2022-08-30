/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.firestore.v1.stub;

import static com.google.cloud.firestore.v1.FirestoreAdminClient.ListFieldsPagedResponse;
import static com.google.cloud.firestore.v1.FirestoreAdminClient.ListIndexesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonOperationSnapshot;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.httpjson.longrunning.stub.HttpJsonOperationsStub;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.firestore.admin.v1.CreateIndexRequest;
import com.google.firestore.admin.v1.Database;
import com.google.firestore.admin.v1.DeleteIndexRequest;
import com.google.firestore.admin.v1.ExportDocumentsMetadata;
import com.google.firestore.admin.v1.ExportDocumentsRequest;
import com.google.firestore.admin.v1.ExportDocumentsResponse;
import com.google.firestore.admin.v1.Field;
import com.google.firestore.admin.v1.FieldOperationMetadata;
import com.google.firestore.admin.v1.GetDatabaseRequest;
import com.google.firestore.admin.v1.GetFieldRequest;
import com.google.firestore.admin.v1.GetIndexRequest;
import com.google.firestore.admin.v1.ImportDocumentsMetadata;
import com.google.firestore.admin.v1.ImportDocumentsRequest;
import com.google.firestore.admin.v1.Index;
import com.google.firestore.admin.v1.IndexOperationMetadata;
import com.google.firestore.admin.v1.ListDatabasesRequest;
import com.google.firestore.admin.v1.ListDatabasesResponse;
import com.google.firestore.admin.v1.ListFieldsRequest;
import com.google.firestore.admin.v1.ListFieldsResponse;
import com.google.firestore.admin.v1.ListIndexesRequest;
import com.google.firestore.admin.v1.ListIndexesResponse;
import com.google.firestore.admin.v1.UpdateDatabaseMetadata;
import com.google.firestore.admin.v1.UpdateDatabaseRequest;
import com.google.firestore.admin.v1.UpdateFieldRequest;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the FirestoreAdmin service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi
public class HttpJsonFirestoreAdminStub extends FirestoreAdminStub {
  private static final TypeRegistry typeRegistry =
      TypeRegistry.newBuilder()
          .add(ExportDocumentsResponse.getDescriptor())
          .add(UpdateDatabaseMetadata.getDescriptor())
          .add(Field.getDescriptor())
          .add(Empty.getDescriptor())
          .add(ImportDocumentsMetadata.getDescriptor())
          .add(Database.getDescriptor())
          .add(Index.getDescriptor())
          .add(FieldOperationMetadata.getDescriptor())
          .add(ExportDocumentsMetadata.getDescriptor())
          .add(IndexOperationMetadata.getDescriptor())
          .build();

  private static final ApiMethodDescriptor<CreateIndexRequest, Operation>
      createIndexMethodDescriptor =
          ApiMethodDescriptor.<CreateIndexRequest, Operation>newBuilder()
              .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/CreateIndex")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateIndexRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/databases/*/collectionGroups/*}/indexes",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateIndexRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateIndexRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create().toBody("index", request.getIndex()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CreateIndexRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ListIndexesRequest, ListIndexesResponse>
      listIndexesMethodDescriptor =
          ApiMethodDescriptor.<ListIndexesRequest, ListIndexesResponse>newBuilder()
              .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/ListIndexes")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListIndexesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/databases/*/collectionGroups/*}/indexes",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListIndexesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListIndexesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListIndexesResponse>newBuilder()
                      .setDefaultInstance(ListIndexesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetIndexRequest, Index> getIndexMethodDescriptor =
      ApiMethodDescriptor.<GetIndexRequest, Index>newBuilder()
          .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/GetIndex")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetIndexRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/databases/*/collectionGroups/*/indexes/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetIndexRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetIndexRequest> serializer =
                            ProtoRestSerializer.create();
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Index>newBuilder()
                  .setDefaultInstance(Index.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<DeleteIndexRequest, Empty> deleteIndexMethodDescriptor =
      ApiMethodDescriptor.<DeleteIndexRequest, Empty>newBuilder()
          .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/DeleteIndex")
          .setHttpMethod("DELETE")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<DeleteIndexRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/databases/*/collectionGroups/*/indexes/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<DeleteIndexRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<DeleteIndexRequest> serializer =
                            ProtoRestSerializer.create();
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Empty>newBuilder()
                  .setDefaultInstance(Empty.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<GetFieldRequest, Field> getFieldMethodDescriptor =
      ApiMethodDescriptor.<GetFieldRequest, Field>newBuilder()
          .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/GetField")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetFieldRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/databases/*/collectionGroups/*/fields/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetFieldRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetFieldRequest> serializer =
                            ProtoRestSerializer.create();
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Field>newBuilder()
                  .setDefaultInstance(Field.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<UpdateFieldRequest, Operation>
      updateFieldMethodDescriptor =
          ApiMethodDescriptor.<UpdateFieldRequest, Operation>newBuilder()
              .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/UpdateField")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateFieldRequest>newBuilder()
                      .setPath(
                          "/v1/{field.name=projects/*/databases/*/collectionGroups/*/fields/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateFieldRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "field.name", request.getField().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateFieldRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create().toBody("field", request.getField()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (UpdateFieldRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ListFieldsRequest, ListFieldsResponse>
      listFieldsMethodDescriptor =
          ApiMethodDescriptor.<ListFieldsRequest, ListFieldsResponse>newBuilder()
              .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/ListFields")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListFieldsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/databases/*/collectionGroups/*}/fields",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListFieldsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListFieldsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListFieldsResponse>newBuilder()
                      .setDefaultInstance(ListFieldsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ExportDocumentsRequest, Operation>
      exportDocumentsMethodDescriptor =
          ApiMethodDescriptor.<ExportDocumentsRequest, Operation>newBuilder()
              .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/ExportDocuments")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ExportDocumentsRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/databases/*}:exportDocuments",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ExportDocumentsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ExportDocumentsRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (ExportDocumentsRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ImportDocumentsRequest, Operation>
      importDocumentsMethodDescriptor =
          ApiMethodDescriptor.<ImportDocumentsRequest, Operation>newBuilder()
              .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/ImportDocuments")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ImportDocumentsRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/databases/*}:importDocuments",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ImportDocumentsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ImportDocumentsRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (ImportDocumentsRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<GetDatabaseRequest, Database>
      getDatabaseMethodDescriptor =
          ApiMethodDescriptor.<GetDatabaseRequest, Database>newBuilder()
              .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/GetDatabase")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetDatabaseRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/databases/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetDatabaseRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetDatabaseRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Database>newBuilder()
                      .setDefaultInstance(Database.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListDatabasesRequest, ListDatabasesResponse>
      listDatabasesMethodDescriptor =
          ApiMethodDescriptor.<ListDatabasesRequest, ListDatabasesResponse>newBuilder()
              .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/ListDatabases")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListDatabasesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*}/databases",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListDatabasesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListDatabasesRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListDatabasesResponse>newBuilder()
                      .setDefaultInstance(ListDatabasesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdateDatabaseRequest, Operation>
      updateDatabaseMethodDescriptor =
          ApiMethodDescriptor.<UpdateDatabaseRequest, Operation>newBuilder()
              .setFullMethodName("google.firestore.admin.v1.FirestoreAdmin/UpdateDatabase")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateDatabaseRequest>newBuilder()
                      .setPath(
                          "/v1/{database.name=projects/*/databases/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateDatabaseRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "database.name", request.getDatabase().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateDatabaseRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("database", request.getDatabase()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (UpdateDatabaseRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private final UnaryCallable<CreateIndexRequest, Operation> createIndexCallable;
  private final OperationCallable<CreateIndexRequest, Index, IndexOperationMetadata>
      createIndexOperationCallable;
  private final UnaryCallable<ListIndexesRequest, ListIndexesResponse> listIndexesCallable;
  private final UnaryCallable<ListIndexesRequest, ListIndexesPagedResponse>
      listIndexesPagedCallable;
  private final UnaryCallable<GetIndexRequest, Index> getIndexCallable;
  private final UnaryCallable<DeleteIndexRequest, Empty> deleteIndexCallable;
  private final UnaryCallable<GetFieldRequest, Field> getFieldCallable;
  private final UnaryCallable<UpdateFieldRequest, Operation> updateFieldCallable;
  private final OperationCallable<UpdateFieldRequest, Field, FieldOperationMetadata>
      updateFieldOperationCallable;
  private final UnaryCallable<ListFieldsRequest, ListFieldsResponse> listFieldsCallable;
  private final UnaryCallable<ListFieldsRequest, ListFieldsPagedResponse> listFieldsPagedCallable;
  private final UnaryCallable<ExportDocumentsRequest, Operation> exportDocumentsCallable;
  private final OperationCallable<
          ExportDocumentsRequest, ExportDocumentsResponse, ExportDocumentsMetadata>
      exportDocumentsOperationCallable;
  private final UnaryCallable<ImportDocumentsRequest, Operation> importDocumentsCallable;
  private final OperationCallable<ImportDocumentsRequest, Empty, ImportDocumentsMetadata>
      importDocumentsOperationCallable;
  private final UnaryCallable<GetDatabaseRequest, Database> getDatabaseCallable;
  private final UnaryCallable<ListDatabasesRequest, ListDatabasesResponse> listDatabasesCallable;
  private final UnaryCallable<UpdateDatabaseRequest, Operation> updateDatabaseCallable;
  private final OperationCallable<UpdateDatabaseRequest, Database, UpdateDatabaseMetadata>
      updateDatabaseOperationCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonOperationsStub httpJsonOperationsStub;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonFirestoreAdminStub create(FirestoreAdminStubSettings settings)
      throws IOException {
    return new HttpJsonFirestoreAdminStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonFirestoreAdminStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonFirestoreAdminStub(
        FirestoreAdminStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonFirestoreAdminStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonFirestoreAdminStub(
        FirestoreAdminStubSettings.newHttpJsonBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonFirestoreAdminStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonFirestoreAdminStub(
      FirestoreAdminStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonFirestoreAdminCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonFirestoreAdminStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonFirestoreAdminStub(
      FirestoreAdminStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.httpJsonOperationsStub =
        HttpJsonOperationsStub.create(clientContext, callableFactory, typeRegistry);

    HttpJsonCallSettings<CreateIndexRequest, Operation> createIndexTransportSettings =
        HttpJsonCallSettings.<CreateIndexRequest, Operation>newBuilder()
            .setMethodDescriptor(createIndexMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ListIndexesRequest, ListIndexesResponse> listIndexesTransportSettings =
        HttpJsonCallSettings.<ListIndexesRequest, ListIndexesResponse>newBuilder()
            .setMethodDescriptor(listIndexesMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<GetIndexRequest, Index> getIndexTransportSettings =
        HttpJsonCallSettings.<GetIndexRequest, Index>newBuilder()
            .setMethodDescriptor(getIndexMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<DeleteIndexRequest, Empty> deleteIndexTransportSettings =
        HttpJsonCallSettings.<DeleteIndexRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteIndexMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<GetFieldRequest, Field> getFieldTransportSettings =
        HttpJsonCallSettings.<GetFieldRequest, Field>newBuilder()
            .setMethodDescriptor(getFieldMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<UpdateFieldRequest, Operation> updateFieldTransportSettings =
        HttpJsonCallSettings.<UpdateFieldRequest, Operation>newBuilder()
            .setMethodDescriptor(updateFieldMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ListFieldsRequest, ListFieldsResponse> listFieldsTransportSettings =
        HttpJsonCallSettings.<ListFieldsRequest, ListFieldsResponse>newBuilder()
            .setMethodDescriptor(listFieldsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ExportDocumentsRequest, Operation> exportDocumentsTransportSettings =
        HttpJsonCallSettings.<ExportDocumentsRequest, Operation>newBuilder()
            .setMethodDescriptor(exportDocumentsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ImportDocumentsRequest, Operation> importDocumentsTransportSettings =
        HttpJsonCallSettings.<ImportDocumentsRequest, Operation>newBuilder()
            .setMethodDescriptor(importDocumentsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<GetDatabaseRequest, Database> getDatabaseTransportSettings =
        HttpJsonCallSettings.<GetDatabaseRequest, Database>newBuilder()
            .setMethodDescriptor(getDatabaseMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ListDatabasesRequest, ListDatabasesResponse>
        listDatabasesTransportSettings =
            HttpJsonCallSettings.<ListDatabasesRequest, ListDatabasesResponse>newBuilder()
                .setMethodDescriptor(listDatabasesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<UpdateDatabaseRequest, Operation> updateDatabaseTransportSettings =
        HttpJsonCallSettings.<UpdateDatabaseRequest, Operation>newBuilder()
            .setMethodDescriptor(updateDatabaseMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();

    this.createIndexCallable =
        callableFactory.createUnaryCallable(
            createIndexTransportSettings, settings.createIndexSettings(), clientContext);
    this.createIndexOperationCallable =
        callableFactory.createOperationCallable(
            createIndexTransportSettings,
            settings.createIndexOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.listIndexesCallable =
        callableFactory.createUnaryCallable(
            listIndexesTransportSettings, settings.listIndexesSettings(), clientContext);
    this.listIndexesPagedCallable =
        callableFactory.createPagedCallable(
            listIndexesTransportSettings, settings.listIndexesSettings(), clientContext);
    this.getIndexCallable =
        callableFactory.createUnaryCallable(
            getIndexTransportSettings, settings.getIndexSettings(), clientContext);
    this.deleteIndexCallable =
        callableFactory.createUnaryCallable(
            deleteIndexTransportSettings, settings.deleteIndexSettings(), clientContext);
    this.getFieldCallable =
        callableFactory.createUnaryCallable(
            getFieldTransportSettings, settings.getFieldSettings(), clientContext);
    this.updateFieldCallable =
        callableFactory.createUnaryCallable(
            updateFieldTransportSettings, settings.updateFieldSettings(), clientContext);
    this.updateFieldOperationCallable =
        callableFactory.createOperationCallable(
            updateFieldTransportSettings,
            settings.updateFieldOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.listFieldsCallable =
        callableFactory.createUnaryCallable(
            listFieldsTransportSettings, settings.listFieldsSettings(), clientContext);
    this.listFieldsPagedCallable =
        callableFactory.createPagedCallable(
            listFieldsTransportSettings, settings.listFieldsSettings(), clientContext);
    this.exportDocumentsCallable =
        callableFactory.createUnaryCallable(
            exportDocumentsTransportSettings, settings.exportDocumentsSettings(), clientContext);
    this.exportDocumentsOperationCallable =
        callableFactory.createOperationCallable(
            exportDocumentsTransportSettings,
            settings.exportDocumentsOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.importDocumentsCallable =
        callableFactory.createUnaryCallable(
            importDocumentsTransportSettings, settings.importDocumentsSettings(), clientContext);
    this.importDocumentsOperationCallable =
        callableFactory.createOperationCallable(
            importDocumentsTransportSettings,
            settings.importDocumentsOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.getDatabaseCallable =
        callableFactory.createUnaryCallable(
            getDatabaseTransportSettings, settings.getDatabaseSettings(), clientContext);
    this.listDatabasesCallable =
        callableFactory.createUnaryCallable(
            listDatabasesTransportSettings, settings.listDatabasesSettings(), clientContext);
    this.updateDatabaseCallable =
        callableFactory.createUnaryCallable(
            updateDatabaseTransportSettings, settings.updateDatabaseSettings(), clientContext);
    this.updateDatabaseOperationCallable =
        callableFactory.createOperationCallable(
            updateDatabaseTransportSettings,
            settings.updateDatabaseOperationSettings(),
            clientContext,
            httpJsonOperationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(createIndexMethodDescriptor);
    methodDescriptors.add(listIndexesMethodDescriptor);
    methodDescriptors.add(getIndexMethodDescriptor);
    methodDescriptors.add(deleteIndexMethodDescriptor);
    methodDescriptors.add(getFieldMethodDescriptor);
    methodDescriptors.add(updateFieldMethodDescriptor);
    methodDescriptors.add(listFieldsMethodDescriptor);
    methodDescriptors.add(exportDocumentsMethodDescriptor);
    methodDescriptors.add(importDocumentsMethodDescriptor);
    methodDescriptors.add(getDatabaseMethodDescriptor);
    methodDescriptors.add(listDatabasesMethodDescriptor);
    methodDescriptors.add(updateDatabaseMethodDescriptor);
    return methodDescriptors;
  }

  public HttpJsonOperationsStub getHttpJsonOperationsStub() {
    return httpJsonOperationsStub;
  }

  @Override
  public UnaryCallable<CreateIndexRequest, Operation> createIndexCallable() {
    return createIndexCallable;
  }

  @Override
  public OperationCallable<CreateIndexRequest, Index, IndexOperationMetadata>
      createIndexOperationCallable() {
    return createIndexOperationCallable;
  }

  @Override
  public UnaryCallable<ListIndexesRequest, ListIndexesResponse> listIndexesCallable() {
    return listIndexesCallable;
  }

  @Override
  public UnaryCallable<ListIndexesRequest, ListIndexesPagedResponse> listIndexesPagedCallable() {
    return listIndexesPagedCallable;
  }

  @Override
  public UnaryCallable<GetIndexRequest, Index> getIndexCallable() {
    return getIndexCallable;
  }

  @Override
  public UnaryCallable<DeleteIndexRequest, Empty> deleteIndexCallable() {
    return deleteIndexCallable;
  }

  @Override
  public UnaryCallable<GetFieldRequest, Field> getFieldCallable() {
    return getFieldCallable;
  }

  @Override
  public UnaryCallable<UpdateFieldRequest, Operation> updateFieldCallable() {
    return updateFieldCallable;
  }

  @Override
  public OperationCallable<UpdateFieldRequest, Field, FieldOperationMetadata>
      updateFieldOperationCallable() {
    return updateFieldOperationCallable;
  }

  @Override
  public UnaryCallable<ListFieldsRequest, ListFieldsResponse> listFieldsCallable() {
    return listFieldsCallable;
  }

  @Override
  public UnaryCallable<ListFieldsRequest, ListFieldsPagedResponse> listFieldsPagedCallable() {
    return listFieldsPagedCallable;
  }

  @Override
  public UnaryCallable<ExportDocumentsRequest, Operation> exportDocumentsCallable() {
    return exportDocumentsCallable;
  }

  @Override
  public OperationCallable<ExportDocumentsRequest, ExportDocumentsResponse, ExportDocumentsMetadata>
      exportDocumentsOperationCallable() {
    return exportDocumentsOperationCallable;
  }

  @Override
  public UnaryCallable<ImportDocumentsRequest, Operation> importDocumentsCallable() {
    return importDocumentsCallable;
  }

  @Override
  public OperationCallable<ImportDocumentsRequest, Empty, ImportDocumentsMetadata>
      importDocumentsOperationCallable() {
    return importDocumentsOperationCallable;
  }

  @Override
  public UnaryCallable<GetDatabaseRequest, Database> getDatabaseCallable() {
    return getDatabaseCallable;
  }

  @Override
  public UnaryCallable<ListDatabasesRequest, ListDatabasesResponse> listDatabasesCallable() {
    return listDatabasesCallable;
  }

  @Override
  public UnaryCallable<UpdateDatabaseRequest, Operation> updateDatabaseCallable() {
    return updateDatabaseCallable;
  }

  @Override
  public OperationCallable<UpdateDatabaseRequest, Database, UpdateDatabaseMetadata>
      updateDatabaseOperationCallable() {
    return updateDatabaseOperationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}