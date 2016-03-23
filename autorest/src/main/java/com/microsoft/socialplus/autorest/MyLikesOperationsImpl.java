/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.socialplus.autorest.models.FeedResponseTopicView;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in MyLikesOperations.
 */
public final class MyLikesOperationsImpl implements MyLikesOperations {
    /** The Retrofit service to perform REST calls. */
    private MyLikesService service;
    /** The service client containing this operation class. */
    private SocialPlusClient client;

    /**
     * Initializes an instance of MyLikesOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MyLikesOperationsImpl(Retrofit retrofit, SocialPlusClient client) {
        this.service = retrofit.create(MyLikesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MyLikesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MyLikesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("v0.2/users/me/likes/topics")
        Call<ResponseBody> getLikedTopics(@Query("cursor") String cursor, @Query("limit") Integer limit, @Header("Authorization") String authorization);

    }

    /**
     * Get my liked topics.
     *
     * @param authorization Authenication (must begin with string "Bearer ")
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseTopicView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseTopicView> getLikedTopics(String authorization, String cursor, Integer limit) throws ServiceException, IOException, IllegalArgumentException {
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getLikedTopics(cursor, limit, authorization);
        return getLikedTopicsDelegate(call.execute());
    }

    /**
     * Get my liked topics.
     *
     * @param authorization Authenication (must begin with string "Bearer ")
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getLikedTopicsAsync(String authorization, String cursor, Integer limit, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getLikedTopics(cursor, limit, authorization);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseTopicView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getLikedTopicsDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<FeedResponseTopicView> getLikedTopicsDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<FeedResponseTopicView, ServiceException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<FeedResponseTopicView>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
