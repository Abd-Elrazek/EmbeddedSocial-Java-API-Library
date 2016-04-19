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
import com.microsoft.socialplus.autorest.models.FeedResponseUserCompactView;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in SearchOperations.
 */
public interface SearchOperations {
    /**
     * Search topics with a query.
     * The query string will be searched across hashtags, topic titles, and topic texts,
     *              and matching results will be returned.
     *             
     *              If the query string contains only hashtags, e.g. #foo #bar, then only the hashtags
     *              in topics will be searched.
     *             
     *              Query string supports the following operators:
     *              - suffix: "foo*"
     *              - and: "foo+bar"
     *              - or: "foo|bar"
     *              - not: "-foo"
     *              - phrase: ""foo bar""
     *              - precedence: "foo+(bar|baz)"
     *              You need to escape * if it is at the end of a word, and - if it is at the start of a word.
     *              Default behavior is to use and, so if you use whitespace to separate words,
     *              such as "foo bar", that is equivalent to "foo+bar".
     *
     * @param query Search query
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseTopicView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseTopicView> getTopics(String query) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Search topics with a query.
     * The query string will be searched across hashtags, topic titles, and topic texts,
     *              and matching results will be returned.
     *             
     *              If the query string contains only hashtags, e.g. #foo #bar, then only the hashtags
     *              in topics will be searched.
     *             
     *              Query string supports the following operators:
     *              - suffix: "foo*"
     *              - and: "foo+bar"
     *              - or: "foo|bar"
     *              - not: "-foo"
     *              - phrase: ""foo bar""
     *              - precedence: "foo+(bar|baz)"
     *              You need to escape * if it is at the end of a word, and - if it is at the start of a word.
     *              Default behavior is to use and, so if you use whitespace to separate words,
     *              such as "foo bar", that is equivalent to "foo+bar".
     *
     * @param query Search query
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTopicsAsync(String query, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException;
    /**
     * Search topics with a query.
     * The query string will be searched across hashtags, topic titles, and topic texts,
     *              and matching results will be returned.
     *             
     *              If the query string contains only hashtags, e.g. #foo #bar, then only the hashtags
     *              in topics will be searched.
     *             
     *              Query string supports the following operators:
     *              - suffix: "foo*"
     *              - and: "foo+bar"
     *              - or: "foo|bar"
     *              - not: "-foo"
     *              - phrase: ""foo bar""
     *              - precedence: "foo+(bar|baz)"
     *              You need to escape * if it is at the end of a word, and - if it is at the start of a word.
     *              Default behavior is to use and, so if you use whitespace to separate words,
     *              such as "foo bar", that is equivalent to "foo+bar".
     *
     * @param query Search query
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
     * @return the FeedResponseTopicView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseTopicView> getTopics(String query, Integer cursor, Integer limit, String appkey, String authorization, String userHandle) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Search topics with a query.
     * The query string will be searched across hashtags, topic titles, and topic texts,
     *              and matching results will be returned.
     *             
     *              If the query string contains only hashtags, e.g. #foo #bar, then only the hashtags
     *              in topics will be searched.
     *             
     *              Query string supports the following operators:
     *              - suffix: "foo*"
     *              - and: "foo+bar"
     *              - or: "foo|bar"
     *              - not: "-foo"
     *              - phrase: ""foo bar""
     *              - precedence: "foo+(bar|baz)"
     *              You need to escape * if it is at the end of a word, and - if it is at the start of a word.
     *              Default behavior is to use and, so if you use whitespace to separate words,
     *              such as "foo bar", that is equivalent to "foo+bar".
     *
     * @param query Search query
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
    ServiceCall getTopicsAsync(String query, Integer cursor, Integer limit, String appkey, String authorization, String userHandle, final ServiceCallback<FeedResponseTopicView> serviceCallback) throws IllegalArgumentException;

    /**
     * Search users with a query.
     * The query string will be searched across the full name of users
     *              and matching results will be returned.
     *             
     *              Query string supports the following operators:
     *              - suffix: "foo*"
     *              - and: "foo+bar"
     *              - or: "foo|bar"
     *              - not: "-foo"
     *              - phrase: ""foo bar""
     *              - precedence: "foo+(bar|baz)"
     *              You need to escape * if it is at the end of a word, and - if it is at the start of a word.
     *              Default behavior is to use and, so if you use whitespace to separate words,
     *              such as "foo bar", that is equivalent to "foo+bar".
     *
     * @param query Search query
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseUserCompactView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseUserCompactView> getUsers(String query) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Search users with a query.
     * The query string will be searched across the full name of users
     *              and matching results will be returned.
     *             
     *              Query string supports the following operators:
     *              - suffix: "foo*"
     *              - and: "foo+bar"
     *              - or: "foo|bar"
     *              - not: "-foo"
     *              - phrase: ""foo bar""
     *              - precedence: "foo+(bar|baz)"
     *              You need to escape * if it is at the end of a word, and - if it is at the start of a word.
     *              Default behavior is to use and, so if you use whitespace to separate words,
     *              such as "foo bar", that is equivalent to "foo+bar".
     *
     * @param query Search query
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getUsersAsync(String query, final ServiceCallback<FeedResponseUserCompactView> serviceCallback) throws IllegalArgumentException;
    /**
     * Search users with a query.
     * The query string will be searched across the full name of users
     *              and matching results will be returned.
     *             
     *              Query string supports the following operators:
     *              - suffix: "foo*"
     *              - and: "foo+bar"
     *              - or: "foo|bar"
     *              - not: "-foo"
     *              - phrase: ""foo bar""
     *              - precedence: "foo+(bar|baz)"
     *              You need to escape * if it is at the end of a word, and - if it is at the start of a word.
     *              Default behavior is to use and, so if you use whitespace to separate words,
     *              such as "foo bar", that is equivalent to "foo+bar".
     *
     * @param query Search query
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
     * @return the FeedResponseUserCompactView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseUserCompactView> getUsers(String query, Integer cursor, Integer limit, String appkey, String authorization, String userHandle) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Search users with a query.
     * The query string will be searched across the full name of users
     *              and matching results will be returned.
     *             
     *              Query string supports the following operators:
     *              - suffix: "foo*"
     *              - and: "foo+bar"
     *              - or: "foo|bar"
     *              - not: "-foo"
     *              - phrase: ""foo bar""
     *              - precedence: "foo+(bar|baz)"
     *              You need to escape * if it is at the end of a word, and - if it is at the start of a word.
     *              Default behavior is to use and, so if you use whitespace to separate words,
     *              such as "foo bar", that is equivalent to "foo+bar".
     *
     * @param query Search query
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
    ServiceCall getUsersAsync(String query, Integer cursor, Integer limit, String appkey, String authorization, String userHandle, final ServiceCallback<FeedResponseUserCompactView> serviceCallback) throws IllegalArgumentException;

}
