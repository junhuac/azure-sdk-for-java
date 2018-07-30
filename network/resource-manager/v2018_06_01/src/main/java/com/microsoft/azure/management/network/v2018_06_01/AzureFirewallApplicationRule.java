/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of an application rule.
 */
public class AzureFirewallApplicationRule {
    /**
     * Name of the application rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /**
     * Array of ApplicationRuleProtocols.
     */
    @JsonProperty(value = "protocols")
    private List<AzureFirewallApplicationRuleProtocol> protocols;

    /**
     * List of URLs for this rule.
     */
    @JsonProperty(value = "targetUrls")
    private List<String> targetUrls;

    /**
     * Get name of the application rule.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the application rule.
     *
     * @param name the name value to set
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get description of the rule.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the rule.
     *
     * @param description the description value to set
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get list of source IP addresses for this rule.
     *
     * @return the sourceAddresses value
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set list of source IP addresses for this rule.
     *
     * @param sourceAddresses the sourceAddresses value to set
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get array of ApplicationRuleProtocols.
     *
     * @return the protocols value
     */
    public List<AzureFirewallApplicationRuleProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set array of ApplicationRuleProtocols.
     *
     * @param protocols the protocols value to set
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withProtocols(List<AzureFirewallApplicationRuleProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get list of URLs for this rule.
     *
     * @return the targetUrls value
     */
    public List<String> targetUrls() {
        return this.targetUrls;
    }

    /**
     * Set list of URLs for this rule.
     *
     * @param targetUrls the targetUrls value to set
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withTargetUrls(List<String> targetUrls) {
        this.targetUrls = targetUrls;
        return this;
    }

}
