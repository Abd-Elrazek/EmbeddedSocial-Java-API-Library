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
import com.microsoft.socialplus.autorest.models.FeedResponseUserCompactView;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in TopicLikesOperations.
 */
public final class TopicLikesOperationsImpl implements TopicLikesOperations {
    /** The Retrofit service to perform REST calls. */
    private TopicLikesService service;
    /** The service client containing this operation class. */
    private SocialPlusClient client;

    /**
     * Initializes an instance of TopicLikesOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TopicLikesOperationsImpl(Retrofit retrofit, SocialPlusClient client) {
        this.service = retrofit.create(TopicLikesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for TopicLikesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TopicLikesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("v0.2/topics/{topicHandle}/likes")
        Call<ResponseBody> getLikes(@Path("topicHandle") String topicHandle, @Query("cursor") String cursor, @Query("limit") Integer limit, @Header("appkey") String appkey, @Header("Authorization") String authorization);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("v0.2/topics/{topicHandle}/likes")
        Call<ResponseBody> postLike(@Path("topicHandle") String topicHandle, @Header("Authorization") String authorization);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "v0.2/topics/{topicHandle}/likes/me", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteLike(@Path("topicHandle") String topicHandle, @Header("Authorization") String authorization);

    }

    /**
     * Get likes for topic.
     *
     * @param topicHandle Topic handle
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseUserCompactView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseUserCompactView> getLikes(String topicHandle) throws ServiceException, IOException, IllegalArgumentException {
        if (topicHandle == null) {
            throw new IllegalArgumentException("Parameter topicHandle is required and cannot be null.");
        }
        final String cursor = null;
        final Integer limit = null;
        final String appkey = null;
        final String authorization = null;
        Call<ResponseBody> call = service.getLikes(topicHandle, cursor, limit, appkey, authorization);
        return getLikesDelegate(call.execute());
    }

    /**
     * Get likes for topic.
     *
     * @param topicHandle Topic handle
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getLikesAsync(String topicHandle, final ServiceCallback<FeedResponseUserCompactView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (topicHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter topicHandle is required and cannot be null."));
            return null;
        }
        final String cursor = null;
        final Integer limit = null;
        final String appkey = null;
        final String authorization = null;
        Call<ResponseBody> call = service.getLikes(topicHandle, cursor, limit, appkey, authorization);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseUserCompactView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getLikesDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Get likes for topic.
     *
     * @param topicHandle Topic handle
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param appkey App Key Authentication
     * @param authorization Authenication (must begin with string "Bearer ")
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseUserCompactView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseUserCompactView> getLikes(String topicHandle, String cursor, Integer limit, String appkey, String authorization) throws ServiceException, IOException, IllegalArgumentException {
        if (topicHandle == null) {
            throw new IllegalArgumentException("Parameter topicHandle is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getLikes(topicHandle, cursor, limit, appkey, authorization);
        return getLikesDelegate(call.execute());
    }

    /**
     * Get likes for topic.
     *
     * @param topicHandle Topic handle
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param appkey App Key Authentication
     * @param authorization Authenication (must begin with string "Bearer ")
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getLikesAsync(String topicHandle, String cursor, Integer limit, String appkey, String authorization, final ServiceCallback<FeedResponseUserCompactView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (topicHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter topicHandle is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getLikes(topicHandle, cursor, limit, appkey, authorization);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseUserCompactView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getLikesDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<FeedResponseUserCompactView> getLikesDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<FeedResponseUserCompactView, ServiceException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<FeedResponseUserCompactView>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Add like to topic.
     *
     * @param topicHandle Topic handle
     * @param authorization Authenication (must begin with string "Bearer ")
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> postLike(String topicHandle, String authorization) throws ServiceException, IOException, IllegalArgumentException {
        if (topicHandle == null) {
            throw new IllegalArgumentException("Parameter topicHandle is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Call<ResponseBody> call = service.postLike(topicHandle, authorization);
        return postLikeDelegate(call.execute());
    }

    /**
     * Add like to topic.
     *
     * @param topicHandle Topic handle
     * @param authorization Authenication (must begin with string "Bearer ")
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postLikeAsync(String topicHandle, String authorization, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (topicHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter topicHandle is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.postLike(topicHandle, authorization);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postLikeDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> postLikeDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Object, ServiceException>(this.client.getMapperAdapter())
                .register(204, new TypeToken<Object>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(409, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Remove like from topic.
     *
     * @param topicHandle Topic handle
     * @param authorization Authenication (must begin with string "Bearer ")
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteLike(String topicHandle, String authorization) throws ServiceException, IOException, IllegalArgumentException {
        if (topicHandle == null) {
            throw new IllegalArgumentException("Parameter topicHandle is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteLike(topicHandle, authorization);
        return deleteLikeDelegate(call.execute());
    }

    /**
     * Remove like from topic.
     *
     * @param topicHandle Topic handle
     * @param authorization Authenication (must begin with string "Bearer ")
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteLikeAsync(String topicHandle, String authorization, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (topicHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter topicHandle is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteLike(topicHandle, authorization);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteLikeDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteLikeDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Object, ServiceException>(this.client.getMapperAdapter())
                .register(204, new TypeToken<Object>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(409, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
