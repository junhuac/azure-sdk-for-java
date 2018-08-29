/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01.implementation;

import com.microsoft.azure.management.containerregistry.v2018_09_01.ProvisioningState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2018_09_01.TaskStatus;
import com.microsoft.azure.management.containerregistry.v2018_09_01.PlatformProperties;
import com.microsoft.azure.management.containerregistry.v2018_09_01.AgentProperties;
import com.microsoft.azure.management.containerregistry.v2018_09_01.TaskStepProperties;
import com.microsoft.azure.management.containerregistry.v2018_09_01.TriggerProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * The task that has the ARM resource and task properties.
 * The  task will have all information to schedule a run against it.
 */
@JsonFlatten
public class TaskInner extends Resource {
    /**
     * The provisioning state of the task. Possible values include: 'Creating',
     * 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The creation date of task.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * The current status of task. Possible values include: 'Disabled',
     * 'Enabled'.
     */
    @JsonProperty(value = "properties.status")
    private TaskStatus status;

    /**
     * The platform properties against which the run has to happen.
     */
    @JsonProperty(value = "properties.platform", required = true)
    private PlatformProperties platform;

    /**
     * The machine configuration of the run agent.
     */
    @JsonProperty(value = "properties.agentConfiguration")
    private AgentProperties agentConfiguration;

    /**
     * Run timeout in seconds.
     */
    @JsonProperty(value = "properties.timeout")
    private Integer timeout;

    /**
     * The properties of a task step.
     */
    @JsonProperty(value = "properties.step", required = true)
    private TaskStepProperties step;

    /**
     * The properties that describe all triggers for the task.
     */
    @JsonProperty(value = "properties.trigger")
    private TriggerProperties trigger;

    /**
     * Get the provisioning state of the task. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the creation date of task.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the current status of task. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the status value
     */
    public TaskStatus status() {
        return this.status;
    }

    /**
     * Set the current status of task. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param status the status value to set
     * @return the TaskInner object itself.
     */
    public TaskInner withStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the platform properties against which the run has to happen.
     *
     * @return the platform value
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform properties against which the run has to happen.
     *
     * @param platform the platform value to set
     * @return the TaskInner object itself.
     */
    public TaskInner withPlatform(PlatformProperties platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the machine configuration of the run agent.
     *
     * @return the agentConfiguration value
     */
    public AgentProperties agentConfiguration() {
        return this.agentConfiguration;
    }

    /**
     * Set the machine configuration of the run agent.
     *
     * @param agentConfiguration the agentConfiguration value to set
     * @return the TaskInner object itself.
     */
    public TaskInner withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get run timeout in seconds.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set run timeout in seconds.
     *
     * @param timeout the timeout value to set
     * @return the TaskInner object itself.
     */
    public TaskInner withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the properties of a task step.
     *
     * @return the step value
     */
    public TaskStepProperties step() {
        return this.step;
    }

    /**
     * Set the properties of a task step.
     *
     * @param step the step value to set
     * @return the TaskInner object itself.
     */
    public TaskInner withStep(TaskStepProperties step) {
        this.step = step;
        return this;
    }

    /**
     * Get the properties that describe all triggers for the task.
     *
     * @return the trigger value
     */
    public TriggerProperties trigger() {
        return this.trigger;
    }

    /**
     * Set the properties that describe all triggers for the task.
     *
     * @param trigger the trigger value to set
     * @return the TaskInner object itself.
     */
    public TaskInner withTrigger(TriggerProperties trigger) {
        this.trigger = trigger;
        return this;
    }

}
