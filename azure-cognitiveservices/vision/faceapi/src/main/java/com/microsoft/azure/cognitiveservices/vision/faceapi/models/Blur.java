/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing any presence of blur within the image.
 */
public class Blur {
    /**
     * An enum value indicating level of blurriness. Possible values include:
     * 'Low', 'Medium', 'High'.
     */
    @JsonProperty(value = "blurLevel")
    private BlurLevel blurLevel;

    /**
     * A number indicating level of blurriness ranging from 0 to 1.
     */
    @JsonProperty(value = "value")
    private double value;

    /**
     * Get an enum value indicating level of blurriness. Possible values include: 'Low', 'Medium', 'High'.
     *
     * @return the blurLevel value
     */
    public BlurLevel blurLevel() {
        return this.blurLevel;
    }

    /**
     * Set an enum value indicating level of blurriness. Possible values include: 'Low', 'Medium', 'High'.
     *
     * @param blurLevel the blurLevel value to set
     * @return the Blur object itself.
     */
    public Blur withBlurLevel(BlurLevel blurLevel) {
        this.blurLevel = blurLevel;
        return this;
    }

    /**
     * Get a number indicating level of blurriness ranging from 0 to 1.
     *
     * @return the value value
     */
    public double value() {
        return this.value;
    }

    /**
     * Set a number indicating level of blurriness ranging from 0 to 1.
     *
     * @param value the value value to set
     * @return the Blur object itself.
     */
    public Blur withValue(double value) {
        this.value = value;
        return this;
    }

}