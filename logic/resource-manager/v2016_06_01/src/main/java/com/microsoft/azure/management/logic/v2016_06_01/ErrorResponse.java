/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response indicates Logic service is not able to process the incoming
 * request. The error property contains the error details.
 */
public class ErrorResponse {
    /**
     * The error properties.
     */
    @JsonProperty(value = "error")
    private ErrorProperties error;

    /**
     * Get the error properties.
     *
     * @return the error value
     */
    public ErrorProperties error() {
        return this.error;
    }

    /**
     * Set the error properties.
     *
     * @param error the error value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withError(ErrorProperties error) {
        this.error = error;
        return this;
    }

}
