/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to post a following (follow user).
 */
public class PostFollowingRequest {
    /**
     * Gets or sets user handle.
     */
    @JsonProperty(required = true)
    private String userHandle;

    /**
     * Get the userHandle value.
     *
     * @return the userHandle value
     */
    public String getUserHandle() {
        return this.userHandle;
    }

    /**
     * Set the userHandle value.
     *
     * @param userHandle the userHandle value to set
     */
    public void setUserHandle(String userHandle) {
        this.userHandle = userHandle;
    }

}
