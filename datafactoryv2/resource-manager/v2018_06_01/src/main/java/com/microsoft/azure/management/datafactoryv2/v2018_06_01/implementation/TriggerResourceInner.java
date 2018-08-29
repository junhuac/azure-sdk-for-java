/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * Trigger resource type.
 */
public class TriggerResourceInner extends SubResource {
    /**
     * Properties of the trigger.
     */
    @JsonProperty(value = "properties", required = true)
    private TriggerInner properties;

    /**
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Etag identifies change in the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get properties of the trigger.
     *
     * @return the properties value
     */
    public TriggerInner properties() {
        return this.properties;
    }

    /**
     * Set properties of the trigger.
     *
     * @param properties the properties value to set
     * @return the TriggerResourceInner object itself.
     */
    public TriggerResourceInner withProperties(TriggerInner properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get etag identifies change in the resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
