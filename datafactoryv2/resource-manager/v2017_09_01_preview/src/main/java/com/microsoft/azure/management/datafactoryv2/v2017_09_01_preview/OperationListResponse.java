/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.DataFactoryManager;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.OperationListResponseInner;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.OperationInner;
import java.util.List;

/**
 * Type representing OperationListResponse.
 */
public interface OperationListResponse extends HasInner<OperationListResponseInner>, HasManager<DataFactoryManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the value value.
     */
    List<OperationInner> value();

}
