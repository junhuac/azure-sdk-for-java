/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Worker pool of an App Service Environment.
 */
public class WorkerPool {
    /**
     * Worker size ID for referencing this worker pool.
     */
    @JsonProperty(value = "workerSizeId")
    private Integer workerSizeId;

    /**
     * Shared or dedicated app hosting. Possible values include: 'Shared',
     * 'Dedicated', 'Dynamic'.
     */
    @JsonProperty(value = "computeMode")
    private ComputeModeOptions computeMode;

    /**
     * VM size of the worker pool instances.
     */
    @JsonProperty(value = "workerSize")
    private String workerSize;

    /**
     * Number of instances in the worker pool.
     */
    @JsonProperty(value = "workerCount")
    private Integer workerCount;

    /**
     * Names of all instances in the worker pool (read only).
     */
    @JsonProperty(value = "instanceNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> instanceNames;

    /**
     * Get worker size ID for referencing this worker pool.
     *
     * @return the workerSizeId value
     */
    public Integer workerSizeId() {
        return this.workerSizeId;
    }

    /**
     * Set worker size ID for referencing this worker pool.
     *
     * @param workerSizeId the workerSizeId value to set
     * @return the WorkerPool object itself.
     */
    public WorkerPool withWorkerSizeId(Integer workerSizeId) {
        this.workerSizeId = workerSizeId;
        return this;
    }

    /**
     * Get shared or dedicated app hosting. Possible values include: 'Shared', 'Dedicated', 'Dynamic'.
     *
     * @return the computeMode value
     */
    public ComputeModeOptions computeMode() {
        return this.computeMode;
    }

    /**
     * Set shared or dedicated app hosting. Possible values include: 'Shared', 'Dedicated', 'Dynamic'.
     *
     * @param computeMode the computeMode value to set
     * @return the WorkerPool object itself.
     */
    public WorkerPool withComputeMode(ComputeModeOptions computeMode) {
        this.computeMode = computeMode;
        return this;
    }

    /**
     * Get vM size of the worker pool instances.
     *
     * @return the workerSize value
     */
    public String workerSize() {
        return this.workerSize;
    }

    /**
     * Set vM size of the worker pool instances.
     *
     * @param workerSize the workerSize value to set
     * @return the WorkerPool object itself.
     */
    public WorkerPool withWorkerSize(String workerSize) {
        this.workerSize = workerSize;
        return this;
    }

    /**
     * Get number of instances in the worker pool.
     *
     * @return the workerCount value
     */
    public Integer workerCount() {
        return this.workerCount;
    }

    /**
     * Set number of instances in the worker pool.
     *
     * @param workerCount the workerCount value to set
     * @return the WorkerPool object itself.
     */
    public WorkerPool withWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
        return this;
    }

    /**
     * Get names of all instances in the worker pool (read only).
     *
     * @return the instanceNames value
     */
    public List<String> instanceNames() {
        return this.instanceNames;
    }

}
