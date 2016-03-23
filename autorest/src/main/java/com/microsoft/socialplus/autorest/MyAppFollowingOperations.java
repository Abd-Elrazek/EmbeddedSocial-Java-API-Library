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
import com.microsoft.socialplus.autorest.models.FeedResponseUserCompactView;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in MyAppFollowingOperations.
 */
public interface MyAppFollowingOperations {
    /**
     * Find users the current user is following in another app but not in the current app.
     *
     * @param appHandle App handle
     * @param authorization Authenication (must begin with string "Bearer ")
     * @param cursor Current read cursor
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseUserCompactView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseUserCompactView> getUsers(String appHandle, String authorization, String cursor) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Find users the current user is following in another app but not in the current app.
     *
     * @param appHandle App handle
     * @param authorization Authenication (must begin with string "Bearer ")
     * @param cursor Current read cursor
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getUsersAsync(String appHandle, String authorization, String cursor, final ServiceCallback<FeedResponseUserCompactView> serviceCallback) throws IllegalArgumentException;

}
