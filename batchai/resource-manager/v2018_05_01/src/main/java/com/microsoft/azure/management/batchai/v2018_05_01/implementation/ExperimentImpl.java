/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01.implementation;

import com.microsoft.azure.management.batchai.v2018_05_01.Experiment;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batchai.v2018_05_01.ProvisioningState;

class ExperimentImpl extends CreatableUpdatableImpl<Experiment, ExperimentInner, ExperimentImpl> implements Experiment, Experiment.Definition, Experiment.Update {
    private final BatchAIManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String experimentName;

    ExperimentImpl(String name, BatchAIManager manager) {
        super(name, new ExperimentInner());
        this.manager = manager;
        // Set resource name
        this.experimentName = name;
        //
    }

    ExperimentImpl(ExperimentInner inner, BatchAIManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.experimentName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.experimentName = IdParsingUtils.getValueFromIdByName(inner.id(), "experiments");
        //
    }

    @Override
    public BatchAIManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Experiment> createResourceAsync() {
        ExperimentsInner client = this.manager().inner().experiments();
        return client.createAsync(this.resourceGroupName, this.workspaceName, this.experimentName)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Experiment> updateResourceAsync() {
        ExperimentsInner client = this.manager().inner().experiments();
        return client.createAsync(this.resourceGroupName, this.workspaceName, this.experimentName)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExperimentInner> getInnerAsync() {
        ExperimentsInner client = this.manager().inner().experiments();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.experimentName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public DateTime provisioningStateTransitionTime() {
        return this.inner().provisioningStateTransitionTime();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ExperimentImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

}
