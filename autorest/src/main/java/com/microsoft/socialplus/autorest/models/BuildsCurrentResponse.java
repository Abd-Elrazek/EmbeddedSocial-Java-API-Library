/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest.models;

import java.util.List;

/**
 * Response from get builds current.
 */
public class BuildsCurrentResponse {
    /**
     * Gets or sets the date and time of the current build.
     */
    private String dateAndTime;

    /**
     * Gets or sets the Git commit hash that represents the current checkout.
     */
    private String commitHash;

    /**
     * Gets or sets the hostname that this code was built on.
     */
    private String hostname;

    /**
     * Gets or sets service api version number.
     */
    private String serviceApiVersion;

    /**
     * Gets or sets the list of files that were not committed at build time.
     */
    private List<String> dirtyFiles;

    /**
     * Get the dateAndTime value.
     *
     * @return the dateAndTime value
     */
    public String getDateAndTime() {
        return this.dateAndTime;
    }

    /**
     * Set the dateAndTime value.
     *
     * @param dateAndTime the dateAndTime value to set
     */
    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    /**
     * Get the commitHash value.
     *
     * @return the commitHash value
     */
    public String getCommitHash() {
        return this.commitHash;
    }

    /**
     * Set the commitHash value.
     *
     * @param commitHash the commitHash value to set
     */
    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

    /**
     * Get the hostname value.
     *
     * @return the hostname value
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * Set the hostname value.
     *
     * @param hostname the hostname value to set
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * Get the serviceApiVersion value.
     *
     * @return the serviceApiVersion value
     */
    public String getServiceApiVersion() {
        return this.serviceApiVersion;
    }

    /**
     * Set the serviceApiVersion value.
     *
     * @param serviceApiVersion the serviceApiVersion value to set
     */
    public void setServiceApiVersion(String serviceApiVersion) {
        this.serviceApiVersion = serviceApiVersion;
    }

    /**
     * Get the dirtyFiles value.
     *
     * @return the dirtyFiles value
     */
    public List<String> getDirtyFiles() {
        return this.dirtyFiles;
    }

    /**
     * Set the dirtyFiles value.
     *
     * @param dirtyFiles the dirtyFiles value to set
     */
    public void setDirtyFiles(List<String> dirtyFiles) {
        this.dirtyFiles = dirtyFiles;
    }

}
