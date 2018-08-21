/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac;

import java.util.Map;
import java.util.List;
import com.microsoft.azure.graphrbac.implementation.KeyCredentialInner;
import com.microsoft.azure.graphrbac.implementation.PasswordCredentialInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request parameters for creating a new application.
 */
public class ApplicationCreateParameters {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Whether the application is available to other tenants.
     */
    @JsonProperty(value = "availableToOtherTenants", required = true)
    private boolean availableToOtherTenants;

    /**
     * The display name of the application.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /**
     * The home page of the application.
     */
    @JsonProperty(value = "homepage")
    private String homepage;

    /**
     * A collection of URIs for the application.
     */
    @JsonProperty(value = "identifierUris", required = true)
    private List<String> identifierUris;

    /**
     * A collection of reply URLs for the application.
     */
    @JsonProperty(value = "replyUrls")
    private List<String> replyUrls;

    /**
     * The list of KeyCredential objects.
     */
    @JsonProperty(value = "keyCredentials")
    private List<KeyCredentialInner> keyCredentials;

    /**
     * The list of PasswordCredential objects.
     */
    @JsonProperty(value = "passwordCredentials")
    private List<PasswordCredentialInner> passwordCredentials;

    /**
     * Whether to allow implicit grant flow for OAuth2.
     */
    @JsonProperty(value = "oauth2AllowImplicitFlow")
    private Boolean oauth2AllowImplicitFlow;

    /**
     * Specifies resources that this application requires access to and the set
     * of OAuth permission scopes and application roles that it needs under
     * each of those resources. This pre-configuration of required resource
     * access drives the consent experience.
     */
    @JsonProperty(value = "requiredResourceAccess")
    private List<RequiredResourceAccess> requiredResourceAccess;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get whether the application is available to other tenants.
     *
     * @return the availableToOtherTenants value
     */
    public boolean availableToOtherTenants() {
        return this.availableToOtherTenants;
    }

    /**
     * Set whether the application is available to other tenants.
     *
     * @param availableToOtherTenants the availableToOtherTenants value to set
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withAvailableToOtherTenants(boolean availableToOtherTenants) {
        this.availableToOtherTenants = availableToOtherTenants;
        return this;
    }

    /**
     * Get the display name of the application.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the application.
     *
     * @param displayName the displayName value to set
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the home page of the application.
     *
     * @return the homepage value
     */
    public String homepage() {
        return this.homepage;
    }

    /**
     * Set the home page of the application.
     *
     * @param homepage the homepage value to set
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Get a collection of URIs for the application.
     *
     * @return the identifierUris value
     */
    public List<String> identifierUris() {
        return this.identifierUris;
    }

    /**
     * Set a collection of URIs for the application.
     *
     * @param identifierUris the identifierUris value to set
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withIdentifierUris(List<String> identifierUris) {
        this.identifierUris = identifierUris;
        return this;
    }

    /**
     * Get a collection of reply URLs for the application.
     *
     * @return the replyUrls value
     */
    public List<String> replyUrls() {
        return this.replyUrls;
    }

    /**
     * Set a collection of reply URLs for the application.
     *
     * @param replyUrls the replyUrls value to set
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withReplyUrls(List<String> replyUrls) {
        this.replyUrls = replyUrls;
        return this;
    }

    /**
     * Get the list of KeyCredential objects.
     *
     * @return the keyCredentials value
     */
    public List<KeyCredentialInner> keyCredentials() {
        return this.keyCredentials;
    }

    /**
     * Set the list of KeyCredential objects.
     *
     * @param keyCredentials the keyCredentials value to set
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withKeyCredentials(List<KeyCredentialInner> keyCredentials) {
        this.keyCredentials = keyCredentials;
        return this;
    }

    /**
     * Get the list of PasswordCredential objects.
     *
     * @return the passwordCredentials value
     */
    public List<PasswordCredentialInner> passwordCredentials() {
        return this.passwordCredentials;
    }

    /**
     * Set the list of PasswordCredential objects.
     *
     * @param passwordCredentials the passwordCredentials value to set
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withPasswordCredentials(List<PasswordCredentialInner> passwordCredentials) {
        this.passwordCredentials = passwordCredentials;
        return this;
    }

    /**
     * Get whether to allow implicit grant flow for OAuth2.
     *
     * @return the oauth2AllowImplicitFlow value
     */
    public Boolean oauth2AllowImplicitFlow() {
        return this.oauth2AllowImplicitFlow;
    }

    /**
     * Set whether to allow implicit grant flow for OAuth2.
     *
     * @param oauth2AllowImplicitFlow the oauth2AllowImplicitFlow value to set
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withOauth2AllowImplicitFlow(Boolean oauth2AllowImplicitFlow) {
        this.oauth2AllowImplicitFlow = oauth2AllowImplicitFlow;
        return this;
    }

    /**
     * Get specifies resources that this application requires access to and the set of OAuth permission scopes and application roles that it needs under each of those resources. This pre-configuration of required resource access drives the consent experience.
     *
     * @return the requiredResourceAccess value
     */
    public List<RequiredResourceAccess> requiredResourceAccess() {
        return this.requiredResourceAccess;
    }

    /**
     * Set specifies resources that this application requires access to and the set of OAuth permission scopes and application roles that it needs under each of those resources. This pre-configuration of required resource access drives the consent experience.
     *
     * @param requiredResourceAccess the requiredResourceAccess value to set
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withRequiredResourceAccess(List<RequiredResourceAccess> requiredResourceAccess) {
        this.requiredResourceAccess = requiredResourceAccess;
        return this;
    }

}
