/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb;

import java.util.List;
import com.microsoft.azure.management.cosmosdb.implementation.FailoverPolicyInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of new failover policies for the failover priority change.
 */
public class FailoverPolicies {
    /**
     * List of failover policies.
     */
    @JsonProperty(value = "failoverPolicies")
    private List<FailoverPolicyInner> failoverPolicies;

    /**
     * Get the failoverPolicies value.
     *
     * @return the failoverPolicies value
     */
    public List<FailoverPolicyInner> failoverPolicies() {
        return this.failoverPolicies;
    }

    /**
     * Set the failoverPolicies value.
     *
     * @param failoverPolicies the failoverPolicies value to set
     * @return the FailoverPolicies object itself.
     */
    public FailoverPolicies withFailoverPolicies(List<FailoverPolicyInner> failoverPolicies) {
        this.failoverPolicies = failoverPolicies;
        return this;
    }

}
