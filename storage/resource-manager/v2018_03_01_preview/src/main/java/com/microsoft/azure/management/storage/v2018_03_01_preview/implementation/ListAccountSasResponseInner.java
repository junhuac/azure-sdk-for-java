/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The List SAS credentials operation response.
 */
public class ListAccountSasResponseInner {
    /**
     * List SAS credentials of storage account.
     */
    @JsonProperty(value = "accountSasToken", access = JsonProperty.Access.WRITE_ONLY)
    private String accountSasToken;

    /**
     * Get the accountSasToken value.
     *
     * @return the accountSasToken value
     */
    public String accountSasToken() {
        return this.accountSasToken;
    }

}
