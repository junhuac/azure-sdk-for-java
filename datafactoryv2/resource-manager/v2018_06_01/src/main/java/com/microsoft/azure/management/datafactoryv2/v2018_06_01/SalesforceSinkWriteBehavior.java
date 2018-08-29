/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SalesforceSinkWriteBehavior.
 */
public final class SalesforceSinkWriteBehavior extends ExpandableStringEnum<SalesforceSinkWriteBehavior> {
    /** Static value Insert for SalesforceSinkWriteBehavior. */
    public static final SalesforceSinkWriteBehavior INSERT = fromString("Insert");

    /** Static value Upsert for SalesforceSinkWriteBehavior. */
    public static final SalesforceSinkWriteBehavior UPSERT = fromString("Upsert");

    /**
     * Creates or finds a SalesforceSinkWriteBehavior from its string representation.
     * @param name a name to look for
     * @return the corresponding SalesforceSinkWriteBehavior
     */
    @JsonCreator
    public static SalesforceSinkWriteBehavior fromString(String name) {
        return fromString(name, SalesforceSinkWriteBehavior.class);
    }

    /**
     * @return known SalesforceSinkWriteBehavior values
     */
    public static Collection<SalesforceSinkWriteBehavior> values() {
        return values(SalesforceSinkWriteBehavior.class);
    }
}
