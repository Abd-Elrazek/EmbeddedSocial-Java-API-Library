/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.socialplus.autorest.models.FeedResponseTopicView;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in UserTopicsOperations.
 */
public interface UserTopicsOperations {
    /**
     * Get user topics sorted by creation time.
     *
     * @param userHandle User handle
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseTopicView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseTopicView> getTopics(String userHandle) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get user topics sorted by creation time.
     *
     * @param userHandle User handle
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTopicsAsync(String userHandle, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException;
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
    ServiceResponse<FeedResponseTopicView> getTopics(String userHandle, String cursor, Integer limit, String appkey, String authorization, String userHandle1) throws ServiceException, IOException, IllegalArgumentException;

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTopicsAsync(String userHandle, String cursor, Integer limit, String appkey, String authorization, String userHandle1, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException;

    /**
     * Get user topics sorted by popularity.
     *
     * @param userHandle User handle
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseTopicView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseTopicView> getPopularTopics(String userHandle) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get user topics sorted by popularity.
     *
     * @param userHandle User handle
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getPopularTopicsAsync(String userHandle, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException;
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
    ServiceResponse<FeedResponseTopicView> getPopularTopics(String userHandle, Integer cursor, Integer limit, String appkey, String authorization, String userHandle1) throws ServiceException, IOException, IllegalArgumentException;

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
     * @return the {@link ServiceCall} object
     */
    ServiceCall getPopularTopicsAsync(String userHandle, Integer cursor, Integer limit, String appkey, String authorization, String userHandle1, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException;

}
