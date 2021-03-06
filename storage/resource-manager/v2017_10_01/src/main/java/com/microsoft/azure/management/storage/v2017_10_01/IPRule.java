/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP rule with specific IP or IP range in CIDR format.
 */
public class IPRule {
    /**
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is
     * allowed.
     */
    @JsonProperty(value = "value", required = true)
    private String iPAddressOrRange;

    /**
     * The action of IP ACL rule. Possible values include: 'Allow'.
     */
    @JsonProperty(value = "action")
    private Action action;

    /**
     * Get the iPAddressOrRange value.
     *
     * @return the iPAddressOrRange value
     */
    public String iPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    /**
     * Set the iPAddressOrRange value.
     *
     * @param iPAddressOrRange the iPAddressOrRange value to set
     * @return the IPRule object itself.
     */
    public IPRule withIPAddressOrRange(String iPAddressOrRange) {
        this.iPAddressOrRange = iPAddressOrRange;
        return this;
    }

    /**
     * Get the action value.
     *
     * @return the action value
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action value.
     *
     * @param action the action value to set
     * @return the IPRule object itself.
     */
    public IPRule withAction(Action action) {
        this.action = action;
        return this;
    }

}
