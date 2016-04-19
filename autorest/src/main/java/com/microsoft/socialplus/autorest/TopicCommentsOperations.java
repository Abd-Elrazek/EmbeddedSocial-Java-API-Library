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
import com.microsoft.socialplus.autorest.models.FeedResponseCommentView;
import com.microsoft.socialplus.autorest.models.PostCommentRequest;
import com.microsoft.socialplus.autorest.models.PostCommentResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in TopicCommentsOperations.
 */
public interface TopicCommentsOperations {
    /**
     * Get comments for a topic.
     *
     * @param topicHandle Topic handle
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseCommentView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseCommentView> getTopicComments(String topicHandle) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get comments for a topic.
     *
     * @param topicHandle Topic handle
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTopicCommentsAsync(String topicHandle, final ServiceCallback<FeedResponseCommentView> serviceCallback) throws IllegalArgumentException;
    /**
     * Get comments for a topic.
     *
     * @param topicHandle Topic handle
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseCommentView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseCommentView> getTopicComments(String topicHandle, String cursor, Integer limit, String appkey, String authorization, String userHandle) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get comments for a topic.
     *
     * @param topicHandle Topic handle
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTopicCommentsAsync(String topicHandle, String cursor, Integer limit, String appkey, String authorization, String userHandle, final ServiceCallback<FeedResponseCommentView> serviceCallback) throws IllegalArgumentException;

    /**
     * Create a new comment.
     *
     * @param topicHandle Topic handle
     * @param request Post comment request
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PostCommentResponse object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PostCommentResponse> postComment(String topicHandle, PostCommentRequest request, String authorization) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Create a new comment.
     *
     * @param topicHandle Topic handle
     * @param request Post comment request
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postCommentAsync(String topicHandle, PostCommentRequest request, String authorization, final ServiceCallback<PostCommentResponse> serviceCallback) throws IllegalArgumentException;
    /**
     * Create a new comment.
     *
     * @param topicHandle Topic handle
     * @param request Post comment request
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PostCommentResponse object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PostCommentResponse> postComment(String topicHandle, PostCommentRequest request, String authorization, String appkey, String userHandle) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Create a new comment.
     *
     * @param topicHandle Topic handle
     * @param request Post comment request
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postCommentAsync(String topicHandle, PostCommentRequest request, String authorization, String appkey, String userHandle, final ServiceCallback<PostCommentResponse> serviceCallback) throws IllegalArgumentException;

}
