/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectedItemsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.VaultProtectedItemResource;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectedItemResourceInner;

/**
 * Type representing ProtectedItems.
 */
public interface ProtectedItems extends HasInner<ProtectedItemsInner> {
    /**
     * Provides the details of the backup item. This is an asynchronous operation. To know the status of the operation, call the GetItemOperationResult API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup item.
     * @param containerName The container name associated with the backup item.
     * @param protectedItemName The backup item name used in this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectedItemResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName);

    /**
     * Used to disable the backup job for an item within a container. This is an asynchronous operation. To learn the status of the request, call the GetItemOperationResult API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup item.
     * @param containerName The container name associated with the backup item.
     * @param protectedItemName The backup item to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName);

    /**
     * Provides a pageable list of all items in a subscription, that can be protected.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VaultProtectedItemResource> listAsync(final String vaultName, final String resourceGroupName);

    /**
     * This operation enables an item to be backed up, or modifies the existing backup policy information for an item that has been backed up. This is an asynchronous operation. To learn the status of the operation, call the GetItemOperationResult API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup item.
     * @param containerName The container name associated with the backup item.
     * @param protectedItemName The name of the backup item.
     * @param resourceProtectedItem The resource backup item.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable createOrUpdateAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, ProtectedItemResourceInner resourceProtectedItem);

}
