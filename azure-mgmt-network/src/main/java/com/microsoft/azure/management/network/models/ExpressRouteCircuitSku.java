/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;


/**
 * Contains sku in an ExpressRouteCircuit.
 */
public class ExpressRouteCircuitSku {
    /**
     * Gets or sets name of the sku.
     */
    private String name;

    /**
     * Gets or sets tier of the sku. Possible values include: 'Standard',
     * 'Premium'.
     */
    private String tier;

    /**
     * Gets or sets family of the sku. Possible values include:
     * 'UnlimitedData', 'MeteredData'.
     */
    private String family;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public String getTier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * Get the family value.
     *
     * @return the family value
     */
    public String getFamily() {
        return this.family;
    }

    /**
     * Set the family value.
     *
     * @param family the family value to set
     */
    public void setFamily(String family) {
        this.family = family;
    }

}