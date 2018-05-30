/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dimension of blobs, possiblly be blob type or access tier.
 */
public class Dimension {
    /**
     * Display name of dimension.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display name of dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Dimension object itself.
     */
    public Dimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the Dimension object itself.
     */
    public Dimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
