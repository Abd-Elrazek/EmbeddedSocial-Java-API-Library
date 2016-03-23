/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for IdentityProvider.
 */
public enum IdentityProvider {
    /** Enum value Facebook. */
    FACEBOOK("Facebook"),

    /** Enum value Microsoft. */
    MICROSOFT("Microsoft"),

    /** Enum value Google. */
    GOOGLE("Google"),

    /** Enum value Twitter. */
    TWITTER("Twitter"),

    /** Enum value Beihai. */
    BEIHAI("Beihai");

    /** The actual serialized value for a IdentityProvider instance. */
    private String value;

    IdentityProvider(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a IdentityProvider instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a IdentityProvider instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IdentityProvider object, or null if unable to parse.
     */
    @JsonCreator
    public static IdentityProvider fromValue(String value) {
        IdentityProvider[] items = IdentityProvider.values();
        for (IdentityProvider item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
