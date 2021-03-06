/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.AutomationManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.AutomationAccountInner;

/**
 * Type representing AutomationAccount.
 */
public interface AutomationAccount extends HasInner<AutomationAccountInner>, Resource, GroupableResourceCore<AutomationManager, AutomationAccountInner>, HasResourceGroup, Refreshable<AutomationAccount>, Updatable<AutomationAccount.Update>, HasManager<AutomationManager> {
    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the lastModifiedBy value.
     */
    String lastModifiedBy();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the state value.
     */
    AutomationAccountState state();

    /**
     * The entirety of the AutomationAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AutomationAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AutomationAccount definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AutomationAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the automationaccount update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AutomationAccount>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a AutomationAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AutomationAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithSku {
    }

    /**
     * Grouping of AutomationAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the automationaccount {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(Sku sku);
        }

    }
}
