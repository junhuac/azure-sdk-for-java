/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Filter and return results from input array based on the conditions.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Filter")
@JsonFlatten
public class FilterActivity extends ControlActivity {
    /**
     * Input array on which filter should be applied.
     */
    @JsonProperty(value = "typeProperties.items", required = true)
    private Expression items;

    /**
     * Condition to be used for filtering the input.
     */
    @JsonProperty(value = "typeProperties.condition", required = true)
    private Expression condition;

    /**
     * Get input array on which filter should be applied.
     *
     * @return the items value
     */
    public Expression items() {
        return this.items;
    }

    /**
     * Set input array on which filter should be applied.
     *
     * @param items the items value to set
     * @return the FilterActivity object itself.
     */
    public FilterActivity withItems(Expression items) {
        this.items = items;
        return this;
    }

    /**
     * Get condition to be used for filtering the input.
     *
     * @return the condition value
     */
    public Expression condition() {
        return this.condition;
    }

    /**
     * Set condition to be used for filtering the input.
     *
     * @param condition the condition value to set
     * @return the FilterActivity object itself.
     */
    public FilterActivity withCondition(Expression condition) {
        this.condition = condition;
        return this;
    }

}
