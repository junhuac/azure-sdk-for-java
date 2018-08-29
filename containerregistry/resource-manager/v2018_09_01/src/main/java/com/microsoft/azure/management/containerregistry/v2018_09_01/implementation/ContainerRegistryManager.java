/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.containerregistry.v2018_09_01.Registries;
import com.microsoft.azure.management.containerregistry.v2018_09_01.Operations;
import com.microsoft.azure.management.containerregistry.v2018_09_01.Replications;
import com.microsoft.azure.management.containerregistry.v2018_09_01.Webhooks;
import com.microsoft.azure.management.containerregistry.v2018_09_01.Runs;
import com.microsoft.azure.management.containerregistry.v2018_09_01.Tasks;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure ContainerRegistry resource management.
 */
public final class ContainerRegistryManager extends ManagerCore<ContainerRegistryManager, ContainerRegistryManagementClientImpl> {
    private Registries registries;
    private Operations operations;
    private Replications replications;
    private Webhooks webhooks;
    private Runs runs;
    private Tasks tasks;
    /**
    * Get a Configurable instance that can be used to create ContainerRegistryManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ContainerRegistryManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ContainerRegistryManager that exposes ContainerRegistry resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the ContainerRegistryManager
    */
    public static ContainerRegistryManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new ContainerRegistryManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of ContainerRegistryManager that exposes ContainerRegistry resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the ContainerRegistryManager
    */
    public static ContainerRegistryManager authenticate(RestClient restClient, String subscriptionId) {
        return new ContainerRegistryManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ContainerRegistryManager that exposes ContainerRegistry management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing ContainerRegistry management API entry points that work across subscriptions
        */
        ContainerRegistryManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Registries.
     */
    public Registries registries() {
        if (this.registries == null) {
            this.registries = new RegistriesImpl(this);
        }
        return this.registries;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Replications.
     */
    public Replications replications() {
        if (this.replications == null) {
            this.replications = new ReplicationsImpl(this);
        }
        return this.replications;
    }

    /**
     * @return Entry point to manage Webhooks.
     */
    public Webhooks webhooks() {
        if (this.webhooks == null) {
            this.webhooks = new WebhooksImpl(this);
        }
        return this.webhooks;
    }

    /**
     * @return Entry point to manage Runs.
     */
    public Runs runs() {
        if (this.runs == null) {
            this.runs = new RunsImpl(this);
        }
        return this.runs;
    }

    /**
     * @return Entry point to manage Tasks.
     */
    public Tasks tasks() {
        if (this.tasks == null) {
            this.tasks = new TasksImpl(this);
        }
        return this.tasks;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ContainerRegistryManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return ContainerRegistryManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private ContainerRegistryManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ContainerRegistryManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
