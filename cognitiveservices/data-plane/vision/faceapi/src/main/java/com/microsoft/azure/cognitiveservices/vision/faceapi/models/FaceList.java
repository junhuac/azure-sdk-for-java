/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Face list object.
 */
public class FaceList extends NameAndUserDataContract {
    /**
     * FaceListId of the target face list.
     */
    @JsonProperty(value = "faceListId", required = true)
    private String faceListId;

    /**
     * Persisted faces within the face list.
     */
    @JsonProperty(value = "persistedFaces")
    private List<PersistedFace> persistedFaces;

    /**
     * Get faceListId of the target face list.
     *
     * @return the faceListId value
     */
    public String faceListId() {
        return this.faceListId;
    }

    /**
     * Set faceListId of the target face list.
     *
     * @param faceListId the faceListId value to set
     * @return the FaceList object itself.
     */
    public FaceList withFaceListId(String faceListId) {
        this.faceListId = faceListId;
        return this;
    }

    /**
     * Get persisted faces within the face list.
     *
     * @return the persistedFaces value
     */
    public List<PersistedFace> persistedFaces() {
        return this.persistedFaces;
    }

    /**
     * Set persisted faces within the face list.
     *
     * @param persistedFaces the persistedFaces value to set
     * @return the FaceList object itself.
     */
    public FaceList withPersistedFaces(List<PersistedFace> persistedFaces) {
        this.persistedFaces = persistedFaces;
        return this;
    }

}
