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
import com.microsoft.rest.Validator;
import com.microsoft.socialplus.autorest.models.FeedResponseReplyView;
import com.microsoft.socialplus.autorest.models.PostReplyRequest;
import com.microsoft.socialplus.autorest.models.PostReplyResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in CommentRepliesOperations.
 */
public final class CommentRepliesOperationsImpl implements CommentRepliesOperations {
    /** The Retrofit service to perform REST calls. */
    private CommentRepliesService service;
    /** The service client containing this operation class. */
    private SocialPlusClient client;

    /**
     * Initializes an instance of CommentRepliesOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CommentRepliesOperationsImpl(Retrofit retrofit, SocialPlusClient client) {
        this.service = retrofit.create(CommentRepliesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for CommentRepliesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CommentRepliesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("v0.3/comments/{commentHandle}/replies")
        Call<ResponseBody> getReplies(@Path("commentHandle") String commentHandle, @Query("cursor") String cursor, @Query("limit") Integer limit, @Header("appkey") String appkey, @Header("Authorization") String authorization, @Header("UserHandle") String userHandle);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("v0.3/comments/{commentHandle}/replies")
        Call<ResponseBody> postReply(@Path("commentHandle") String commentHandle, @Body PostReplyRequest request, @Header("appkey") String appkey, @Header("Authorization") String authorization, @Header("UserHandle") String userHandle);

    }

    /**
     * Get replies for a comment.
     *
     * @param commentHandle Comment handle
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseReplyView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseReplyView> getReplies(String commentHandle, String authorization) throws ServiceException, IOException, IllegalArgumentException {
        if (commentHandle == null) {
            throw new IllegalArgumentException("Parameter commentHandle is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        final String cursor = null;
        final Integer limit = null;
        final String appkey = null;
        final String userHandle = null;
        Call<ResponseBody> call = service.getReplies(commentHandle, cursor, limit, appkey, authorization, userHandle);
        return getRepliesDelegate(call.execute());
    }

    /**
     * Get replies for a comment.
     *
     * @param commentHandle Comment handle
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getRepliesAsync(String commentHandle, String authorization, final ServiceCallback<FeedResponseReplyView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (commentHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter commentHandle is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        final String cursor = null;
        final Integer limit = null;
        final String appkey = null;
        final String userHandle = null;
        Call<ResponseBody> call = service.getReplies(commentHandle, cursor, limit, appkey, authorization, userHandle);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseReplyView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getRepliesDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Get replies for a comment.
     *
     * @param commentHandle Comment handle
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseReplyView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseReplyView> getReplies(String commentHandle, String authorization, String cursor, Integer limit, String appkey, String userHandle) throws ServiceException, IOException, IllegalArgumentException {
        if (commentHandle == null) {
            throw new IllegalArgumentException("Parameter commentHandle is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getReplies(commentHandle, cursor, limit, appkey, authorization, userHandle);
        return getRepliesDelegate(call.execute());
    }

    /**
     * Get replies for a comment.
     *
     * @param commentHandle Comment handle
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getRepliesAsync(String commentHandle, String authorization, String cursor, Integer limit, String appkey, String userHandle, final ServiceCallback<FeedResponseReplyView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (commentHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter commentHandle is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getReplies(commentHandle, cursor, limit, appkey, authorization, userHandle);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseReplyView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getRepliesDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<FeedResponseReplyView> getRepliesDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<FeedResponseReplyView, ServiceException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<FeedResponseReplyView>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Create a new reply.
     *
     * @param commentHandle Comment handle
     * @param request Post reply request
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PostReplyResponse object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PostReplyResponse> postReply(String commentHandle, PostReplyRequest request, String authorization) throws ServiceException, IOException, IllegalArgumentException {
        if (commentHandle == null) {
            throw new IllegalArgumentException("Parameter commentHandle is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Validator.validate(request);
        final String appkey = null;
        final String userHandle = null;
        Call<ResponseBody> call = service.postReply(commentHandle, request, appkey, authorization, userHandle);
        return postReplyDelegate(call.execute());
    }

    /**
     * Create a new reply.
     *
     * @param commentHandle Comment handle
     * @param request Post reply request
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postReplyAsync(String commentHandle, PostReplyRequest request, String authorization, final ServiceCallback<PostReplyResponse> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (commentHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter commentHandle is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        final String appkey = null;
        final String userHandle = null;
        Call<ResponseBody> call = service.postReply(commentHandle, request, appkey, authorization, userHandle);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<PostReplyResponse>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postReplyDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Create a new reply.
     *
     * @param commentHandle Comment handle
     * @param request Post reply request
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PostReplyResponse object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PostReplyResponse> postReply(String commentHandle, PostReplyRequest request, String authorization, String appkey, String userHandle) throws ServiceException, IOException, IllegalArgumentException {
        if (commentHandle == null) {
            throw new IllegalArgumentException("Parameter commentHandle is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.postReply(commentHandle, request, appkey, authorization, userHandle);
        return postReplyDelegate(call.execute());
    }

    /**
     * Create a new reply.
     *
     * @param commentHandle Comment handle
     * @param request Post reply request
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postReplyAsync(String commentHandle, PostReplyRequest request, String authorization, String appkey, String userHandle, final ServiceCallback<PostReplyResponse> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (commentHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter commentHandle is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.postReply(commentHandle, request, appkey, authorization, userHandle);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<PostReplyResponse>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postReplyDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PostReplyResponse> postReplyDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<PostReplyResponse, ServiceException>(this.client.getMapperAdapter())
                .register(201, new TypeToken<PostReplyResponse>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
