/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AS2 agreement acknowledegment connection settings.
 */
public class AS2AcknowledgementConnectionSettings {
    /**
     * The value indicating whether to ignore mismatch in certificate name.
     */
    @JsonProperty(value = "ignoreCertificateNameMismatch", required = true)
    private boolean ignoreCertificateNameMismatch;

    /**
     * The value indicating whether to support HTTP status code 'CONTINUE'.
     */
    @JsonProperty(value = "supportHttpStatusCodeContinue", required = true)
    private boolean supportHttpStatusCodeContinue;

    /**
     * The value indicating whether to keep the connection alive.
     */
    @JsonProperty(value = "keepHttpConnectionAlive", required = true)
    private boolean keepHttpConnectionAlive;

    /**
     * The value indicating whether to unfold the HTTP headers.
     */
    @JsonProperty(value = "unfoldHttpHeaders", required = true)
    private boolean unfoldHttpHeaders;

    /**
     * Get the ignoreCertificateNameMismatch value.
     *
     * @return the ignoreCertificateNameMismatch value
     */
    public boolean ignoreCertificateNameMismatch() {
        return this.ignoreCertificateNameMismatch;
    }

    /**
     * Set the ignoreCertificateNameMismatch value.
     *
     * @param ignoreCertificateNameMismatch the ignoreCertificateNameMismatch value to set
     * @return the AS2AcknowledgementConnectionSettings object itself.
     */
    public AS2AcknowledgementConnectionSettings withIgnoreCertificateNameMismatch(boolean ignoreCertificateNameMismatch) {
        this.ignoreCertificateNameMismatch = ignoreCertificateNameMismatch;
        return this;
    }

    /**
     * Get the supportHttpStatusCodeContinue value.
     *
     * @return the supportHttpStatusCodeContinue value
     */
    public boolean supportHttpStatusCodeContinue() {
        return this.supportHttpStatusCodeContinue;
    }

    /**
     * Set the supportHttpStatusCodeContinue value.
     *
     * @param supportHttpStatusCodeContinue the supportHttpStatusCodeContinue value to set
     * @return the AS2AcknowledgementConnectionSettings object itself.
     */
    public AS2AcknowledgementConnectionSettings withSupportHttpStatusCodeContinue(boolean supportHttpStatusCodeContinue) {
        this.supportHttpStatusCodeContinue = supportHttpStatusCodeContinue;
        return this;
    }

    /**
     * Get the keepHttpConnectionAlive value.
     *
     * @return the keepHttpConnectionAlive value
     */
    public boolean keepHttpConnectionAlive() {
        return this.keepHttpConnectionAlive;
    }

    /**
     * Set the keepHttpConnectionAlive value.
     *
     * @param keepHttpConnectionAlive the keepHttpConnectionAlive value to set
     * @return the AS2AcknowledgementConnectionSettings object itself.
     */
    public AS2AcknowledgementConnectionSettings withKeepHttpConnectionAlive(boolean keepHttpConnectionAlive) {
        this.keepHttpConnectionAlive = keepHttpConnectionAlive;
        return this;
    }

    /**
     * Get the unfoldHttpHeaders value.
     *
     * @return the unfoldHttpHeaders value
     */
    public boolean unfoldHttpHeaders() {
        return this.unfoldHttpHeaders;
    }

    /**
     * Set the unfoldHttpHeaders value.
     *
     * @param unfoldHttpHeaders the unfoldHttpHeaders value to set
     * @return the AS2AcknowledgementConnectionSettings object itself.
     */
    public AS2AcknowledgementConnectionSettings withUnfoldHttpHeaders(boolean unfoldHttpHeaders) {
        this.unfoldHttpHeaders = unfoldHttpHeaders;
        return this;
    }

}
