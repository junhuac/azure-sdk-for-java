/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.DomainOwnershipIdentifierInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;

/**
 * Type representing DomainOwnershipIdentifier.
 */
public interface DomainOwnershipIdentifier extends HasInner<DomainOwnershipIdentifierInner>, Indexable, Refreshable<DomainOwnershipIdentifier>, Updatable<DomainOwnershipIdentifier.Update>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the ownershipId value.
     */
    String ownershipId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DomainOwnershipIdentifier definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDomain, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DomainOwnershipIdentifier definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DomainOwnershipIdentifier definition.
         */
        interface Blank extends WithDomain {
        }

        /**
         * The stage of the domainownershipidentifier definition allowing to specify Domain.
         */
        interface WithDomain {
           /**
            * Specifies resourceGroupName, domainName.
            */
            WithCreate withExistingDomain(String resourceGroupName, String domainName);
        }

        /**
         * The stage of the domainownershipidentifier definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the domainownershipidentifier definition allowing to specify OwnershipId.
         */
        interface WithOwnershipId {
            /**
             * Specifies ownershipId.
             */
            WithCreate withOwnershipId(String ownershipId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DomainOwnershipIdentifier>, DefinitionStages.WithKind, DefinitionStages.WithOwnershipId {
        }
    }
    /**
     * The template for a DomainOwnershipIdentifier update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DomainOwnershipIdentifier>, UpdateStages.WithKind, UpdateStages.WithOwnershipId {
    }

    /**
     * Grouping of DomainOwnershipIdentifier update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the domainownershipidentifier update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the domainownershipidentifier update allowing to specify OwnershipId.
         */
        interface WithOwnershipId {
            /**
             * Specifies ownershipId.
             */
            Update withOwnershipId(String ownershipId);
        }

    }
}
