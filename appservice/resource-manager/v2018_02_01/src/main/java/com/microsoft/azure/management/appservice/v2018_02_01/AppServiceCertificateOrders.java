/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import rx.Observable;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceCertificateOrder;
import rx.Completable;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceCertificateOrderInner;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceCertificateResource;

/**
 * Type representing AppServiceCertificateOrders.
 */
public interface AppServiceCertificateOrders {
    /**
     * Begins definition for a new CertificateOrder resource.
     * @param name resource name.
     * @return the first stage of the new CertificateOrder definition.
     */
    AppServiceCertificateOrder.DefinitionStages.Blank defineCertificateOrder(String name);

    /**
     * Begins definition for a new Certificate resource.
     * @param name resource name.
     * @return the first stage of the new Certificate definition.
     */
    AppServiceCertificateResource.DefinitionStages.Blank defineCertificate(String name);

    /**
     * Get a certificate order.
     * Get a certificate order.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServiceCertificateOrder> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Get certificate orders in a resource group.
     * Get certificate orders in a resource group.
     *
     * @param resourceGroupName resource group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServiceCertificateOrder> listByResourceGroupAsync(String resourceGroupName);

    /**
     * List all certificate orders in a subscription.
     * List all certificate orders in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServiceCertificateOrder> listAsync();

    /**
     * Delete an existing certificate order.
     * Delete an existing certificate order.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String name);

    /**
     * Reissue an existing certificate order.
     * Reissue an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param reissueCertificateOrderRequest Parameters for the reissue.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable reissueAsync(String resourceGroupName, String certificateOrderName, ReissueCertificateOrderRequest reissueCertificateOrderRequest);

    /**
     * Renew an existing certificate order.
     * Renew an existing certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param renewCertificateOrderRequest Renew parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable renewAsync(String resourceGroupName, String certificateOrderName, RenewCertificateOrderRequest renewCertificateOrderRequest);

    /**
     * Resend certificate email.
     * Resend certificate email.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resendEmailAsync(String resourceGroupName, String certificateOrderName);

    /**
     * Verify domain ownership for this certificate order.
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resendRequestEmailsAsync(String resourceGroupName, String certificateOrderName);

    /**
     * Verify domain ownership for this certificate order.
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param siteSealRequest Site seal request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SiteSeal> retrieveSiteSealAsync(String resourceGroupName, String certificateOrderName, SiteSealRequest siteSealRequest);

    /**
     * Verify domain ownership for this certificate order.
     * Verify domain ownership for this certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable verifyDomainOwnershipAsync(String resourceGroupName, String certificateOrderName);

    /**
     * Retrieve the list of certificate actions.
     * Retrieve the list of certificate actions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CertificateOrderAction> retrieveCertificateActionsAsync(String resourceGroupName, String name);

    /**
     * Retrieve email history.
     * Retrieve email history.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CertificateEmail> retrieveCertificateEmailHistoryAsync(String resourceGroupName, String name);

    /**
     * Validate information for a certificate order.
     * Validate information for a certificate order.
     *
     * @param appServiceCertificateOrder Information for a certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable validatePurchaseInformationAsync(AppServiceCertificateOrderInner appServiceCertificateOrder);

    /**
     * Get the certificate associated with a certificate order.
     * Get the certificate associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServiceCertificateResource> getCertificateAsync(String resourceGroupName, String certificateOrderName, String name);

    /**
     * List all certificates associated with a certificate order.
     * List all certificates associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServiceCertificateResource> listCertificatesAsync(final String resourceGroupName, final String certificateOrderName);

    /**
     * Delete the certificate associated with a certificate order.
     * Delete the certificate associated with a certificate order.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName Name of the certificate order.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteCertificateAsync(String resourceGroupName, String certificateOrderName, String name);

}
