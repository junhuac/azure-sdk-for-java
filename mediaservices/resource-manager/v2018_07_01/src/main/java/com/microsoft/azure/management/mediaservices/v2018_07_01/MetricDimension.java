/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A metric dimension.
 */
public class MetricDimension {
    /**
     * The metric dimension name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display name for the dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Whether to export metric to shoebox.
     */
    @JsonProperty(value = "toBeExportedForShoebox", required = true)
    private boolean toBeExportedForShoebox;

    /**
     * Get the metric dimension name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the metric dimension name.
     *
     * @param name the name value to set
     * @return the MetricDimension object itself.
     */
    public MetricDimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display name for the dimension.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name for the dimension.
     *
     * @param displayName the displayName value to set
     * @return the MetricDimension object itself.
     */
    public MetricDimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get whether to export metric to shoebox.
     *
     * @return the toBeExportedForShoebox value
     */
    public boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set whether to export metric to shoebox.
     *
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set
     * @return the MetricDimension object itself.
     */
    public MetricDimension withToBeExportedForShoebox(boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
        return this;
    }

}