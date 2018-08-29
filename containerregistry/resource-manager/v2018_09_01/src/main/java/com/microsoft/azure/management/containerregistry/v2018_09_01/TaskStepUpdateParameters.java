/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base properties for updating any task step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TaskStepUpdateParameters")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Docker", value = DockerBuildStepUpdateParameters.class),
    @JsonSubTypes.Type(name = "FileTask", value = FileTaskStepUpdateParameters.class),
    @JsonSubTypes.Type(name = "EncodedTask", value = EncodedTaskStepUpdateParameters.class)
})
public class TaskStepUpdateParameters {
}
