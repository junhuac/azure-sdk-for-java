/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.ClassicMobileService;
import com.microsoft.azure.management.website.models.ClassicMobileServiceCollection;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in ClassicMobileServicesOperations.
 */
public interface ClassicMobileServicesOperations {
    /**
     * Get all mobile services in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ClassicMobileServiceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ClassicMobileServiceCollection> getClassicMobileServices(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all mobile services in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getClassicMobileServicesAsync(String resourceGroupName, final ServiceCallback<ClassicMobileServiceCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get a mobile service.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of mobile service
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ClassicMobileService object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ClassicMobileService> getClassicMobileService(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get a mobile service.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of mobile service
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getClassicMobileServiceAsync(String resourceGroupName, String name, final ServiceCallback<ClassicMobileService> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete a mobile service.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of mobile service
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteClassicMobileService(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete a mobile service.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of mobile service
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteClassicMobileServiceAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

}