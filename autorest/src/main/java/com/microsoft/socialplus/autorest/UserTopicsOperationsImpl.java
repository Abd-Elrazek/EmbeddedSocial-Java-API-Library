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
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in UserTopicsOperations.
 */
public final class UserTopicsOperationsImpl implements UserTopicsOperations {
    /** The Retrofit service to perform REST calls. */
    private UserTopicsService service;
    /** The service client containing this operation class. */
    private SocialPlusClient client;

    /**
     * Initializes an instance of UserTopicsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UserTopicsOperationsImpl(Retrofit retrofit, SocialPlusClient client) {
        this.service = retrofit.create(UserTopicsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for UserTopicsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UserTopicsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("v0.3/users/{userHandle}/topics")
        Call<ResponseBody> getTopics(@Path("userHandle") String userHandle, @Query("cursor") String cursor, @Query("limit") Integer limit, @Header("appkey") String appkey, @Header("Authorization") String authorization, @Header("UserHandle") String userHandle1);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("v0.3/users/{userHandle}/topics/popular")
        Call<ResponseBody> getPopularTopics(@Path("userHandle") String userHandle, @Query("cursor") Integer cursor, @Query("limit") Integer limit, @Header("appkey") String appkey, @Header("Authorization") String authorization, @Header("UserHandle") String userHandle1);

    }

    /**
     * Get user topics sorted by creation time.
     *
     * @param userHandle User handle
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseTopicView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseTopicView> getTopics(String userHandle) throws ServiceException, IOException, IllegalArgumentException {
        if (userHandle == null) {
            throw new IllegalArgumentException("Parameter userHandle is required and cannot be null.");
        }
        final String cursor = null;
        final Integer limit = null;
        final String appkey = null;
        final String authorization = null;
        final String userHandle1 = null;
        Call<ResponseBody> call = service.getTopics(userHandle, cursor, limit, appkey, authorization, userHandle1);
        return getTopicsDelegate(call.execute());
    }

    /**
     * Get user topics sorted by creation time.
     *
     * @param userHandle User handle
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getTopicsAsync(String userHandle, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (userHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter userHandle is required and cannot be null."));
            return null;
        }
        final String cursor = null;
        final Integer limit = null;
        final String appkey = null;
        final String authorization = null;
        final String userHandle1 = null;
        Call<ResponseBody> call = service.getTopics(userHandle, cursor, limit, appkey, authorization, userHandle1);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseTopicView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getTopicsDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Get user topics sorted by creation time.
     *
     * @param userHandle User handle
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param userHandle1 User handle must be filled when using AAD tokens for Authentication.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseTopicView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseTopicView> getTopics(String userHandle, String cursor, Integer limit, String appkey, String authorization, String userHandle1) throws ServiceException, IOException, IllegalArgumentException {
        if (userHandle == null) {
            throw new IllegalArgumentException("Parameter userHandle is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getTopics(userHandle, cursor, limit, appkey, authorization, userHandle1);
        return getTopicsDelegate(call.execute());
    }

    /**
     * Get user topics sorted by creation time.
     *
     * @param userHandle User handle
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param userHandle1 User handle must be filled when using AAD tokens for Authentication.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getTopicsAsync(String userHandle, String cursor, Integer limit, String appkey, String authorization, String userHandle1, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (userHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter userHandle is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getTopics(userHandle, cursor, limit, appkey, authorization, userHandle1);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseTopicView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getTopicsDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<FeedResponseTopicView> getTopicsDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<FeedResponseTopicView, ServiceException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<FeedResponseTopicView>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Get user topics sorted by popularity.
     *
     * @param userHandle User handle
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseTopicView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseTopicView> getPopularTopics(String userHandle) throws ServiceException, IOException, IllegalArgumentException {
        if (userHandle == null) {
            throw new IllegalArgumentException("Parameter userHandle is required and cannot be null.");
        }
        final Integer cursor = null;
        final Integer limit = null;
        final String appkey = null;
        final String authorization = null;
        final String userHandle1 = null;
        Call<ResponseBody> call = service.getPopularTopics(userHandle, cursor, limit, appkey, authorization, userHandle1);
        return getPopularTopicsDelegate(call.execute());
    }

    /**
     * Get user topics sorted by popularity.
     *
     * @param userHandle User handle
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getPopularTopicsAsync(String userHandle, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (userHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter userHandle is required and cannot be null."));
            return null;
        }
        final Integer cursor = null;
        final Integer limit = null;
        final String appkey = null;
        final String authorization = null;
        final String userHandle1 = null;
        Call<ResponseBody> call = service.getPopularTopics(userHandle, cursor, limit, appkey, authorization, userHandle1);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseTopicView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getPopularTopicsDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Get user topics sorted by popularity.
     *
     * @param userHandle User handle
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param userHandle1 User handle must be filled when using AAD tokens for Authentication.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseTopicView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseTopicView> getPopularTopics(String userHandle, Integer cursor, Integer limit, String appkey, String authorization, String userHandle1) throws ServiceException, IOException, IllegalArgumentException {
        if (userHandle == null) {
            throw new IllegalArgumentException("Parameter userHandle is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getPopularTopics(userHandle, cursor, limit, appkey, authorization, userHandle1);
        return getPopularTopicsDelegate(call.execute());
    }

    /**
     * Get user topics sorted by popularity.
     *
     * @param userHandle User handle
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param userHandle1 User handle must be filled when using AAD tokens for Authentication.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getPopularTopicsAsync(String userHandle, Integer cursor, Integer limit, String appkey, String authorization, String userHandle1, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (userHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter userHandle is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getPopularTopics(userHandle, cursor, limit, appkey, authorization, userHandle1);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseTopicView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getPopularTopicsDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<FeedResponseTopicView> getPopularTopicsDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<FeedResponseTopicView, ServiceException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<FeedResponseTopicView>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
