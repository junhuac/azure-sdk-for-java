/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation;

import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.TriggerResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.TriggerRuntimeState;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.;
import rx.functions.Func1;

class TriggerResourceImpl extends CreatableUpdatableImpl<TriggerResource, TriggerResourceInner, TriggerResourceImpl> implements TriggerResource, TriggerResource.Definition, TriggerResource.Update {
    private final DataFactoryManager manager;
    private String resourceGroupName;
    private String factoryName;
    private String triggerName;
    private TriggerInner cproperties;
    private TriggerInner uproperties;

    TriggerResourceImpl(String name, DataFactoryManager manager) {
        super(name, new TriggerResourceInner());
        this.manager = manager;
        // Set resource name
        this.triggerName = name;
        //
        this.cproperties = new TriggerInner();
        this.uproperties = new TriggerInner();
    }

    TriggerResourceImpl(TriggerResourceInner inner, DataFactoryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.triggerName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.factoryName = IdParsingUtils.getValueFromIdByName(inner.id(), "factories");
        this.triggerName = IdParsingUtils.getValueFromIdByName(inner.id(), "triggers");
        //
        this.cproperties = new TriggerInner();
        this.uproperties = new TriggerInner();
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TriggerResource> createResourceAsync() {
        TriggersInner client = this.manager().inner().triggers();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.triggerName, this.cproperties)
            .map(new Func1<TriggerResourceInner, TriggerResourceInner>() {
               @Override
               public TriggerResourceInner call(TriggerResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<TriggerResource> updateResourceAsync() {
        TriggersInner client = this.manager().inner().triggers();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.triggerName, this.uproperties)
            .map(new Func1<TriggerResourceInner, TriggerResourceInner>() {
               @Override
               public TriggerResourceInner call(TriggerResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TriggerResourceInner> getInnerAsync() {
        TriggersInner client = this.manager().inner().triggers();
        return client.getAsync(this.resourceGroupName, this.factoryName, this.triggerName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new TriggerInner();
        this.uproperties = new TriggerInner();
    }

    @Override
    public String etag() {
        return this.inner().etag();
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
    public TriggerInner properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public TriggerResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    @Override
    public TriggerResourceImpl withProperties(TriggerInner properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
