/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunAction;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.logic.v2018_07_01_preview.Correlation;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2018_07_01_preview.ContentLink;
import java.util.List;
import com.microsoft.azure.management.logic.v2018_07_01_preview.RetryHistory;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowStatus;

class WorkflowRunActionImpl extends IndexableRefreshableWrapperImpl<WorkflowRunAction, WorkflowRunActionInner> implements WorkflowRunAction {
    private final LogicManager manager;
    private String resourceGroupName;
    private String workflowName;
    private String runName;
    private String actionName;

    WorkflowRunActionImpl(WorkflowRunActionInner inner,  LogicManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workflowName = IdParsingUtils.getValueFromIdByName(inner.id(), "workflows");
        this.runName = IdParsingUtils.getValueFromIdByName(inner.id(), "runs");
        this.actionName = IdParsingUtils.getValueFromIdByName(inner.id(), "actions");
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<WorkflowRunActionInner> getInnerAsync() {
        WorkflowRunActionsInner client = this.manager().inner().workflowRunActions();
        return client.getAsync(this.resourceGroupName, this.workflowName, this.runName, this.actionName);
    }



    @Override
    public String code() {
        return this.inner().code();
    }

    @Override
    public Correlation correlation() {
        return this.inner().correlation();
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public Object error() {
        return this.inner().error();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ContentLink inputsLink() {
        return this.inner().inputsLink();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ContentLink outputsLink() {
        return this.inner().outputsLink();
    }

    @Override
    public List<RetryHistory> retryHistory() {
        return this.inner().retryHistory();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public WorkflowStatus status() {
        return this.inner().status();
    }

    @Override
    public Object trackedProperties() {
        return this.inner().trackedProperties();
    }

    @Override
    public String trackingId() {
        return this.inner().trackingId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}