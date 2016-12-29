/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.embeddedsocial.autorest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to put (update) a topic name.
 */
public class PutTopicNameRequest {
    /**
     * Gets or sets publisher type. Possible values include: 'User', 'App'.
     */
    @JsonProperty(required = true)
    private PublisherType publisherType;

    /**
     * Gets or sets topic handle.
     */
    @JsonProperty(required = true)
    private String topicHandle;

    /**
     * Get the publisherType value.
     *
     * @return the publisherType value
     */
    public PublisherType getPublisherType() {
        return this.publisherType;
    }

    /**
     * Set the publisherType value.
     *
     * @param publisherType the publisherType value to set
     */
    public void setPublisherType(PublisherType publisherType) {
        this.publisherType = publisherType;
    }

    /**
     * Get the topicHandle value.
     *
     * @return the topicHandle value
     */
    public String getTopicHandle() {
        return this.topicHandle;
    }

    /**
     * Set the topicHandle value.
     *
     * @param topicHandle the topicHandle value to set
     */
    public void setTopicHandle(String topicHandle) {
        this.topicHandle = topicHandle;
    }

}