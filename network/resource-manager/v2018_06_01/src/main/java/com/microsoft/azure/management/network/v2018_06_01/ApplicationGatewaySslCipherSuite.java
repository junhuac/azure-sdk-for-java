/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationGatewaySslCipherSuite.
 */
public final class ApplicationGatewaySslCipherSuite extends ExpandableStringEnum<ApplicationGatewaySslCipherSuite> {
    /** Static value TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = fromString("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");

    /** Static value TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = fromString("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");

    /** Static value TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = fromString("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");

    /** Static value TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = fromString("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");

    /** Static value TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = fromString("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");

    /** Static value TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = fromString("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");

    /** Static value TLS_DHE_RSA_WITH_AES_256_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA = fromString("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");

    /** Static value TLS_DHE_RSA_WITH_AES_128_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA = fromString("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");

    /** Static value TLS_RSA_WITH_AES_256_GCM_SHA384 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384 = fromString("TLS_RSA_WITH_AES_256_GCM_SHA384");

    /** Static value TLS_RSA_WITH_AES_128_GCM_SHA256 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256 = fromString("TLS_RSA_WITH_AES_128_GCM_SHA256");

    /** Static value TLS_RSA_WITH_AES_256_CBC_SHA256 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256 = fromString("TLS_RSA_WITH_AES_256_CBC_SHA256");

    /** Static value TLS_RSA_WITH_AES_128_CBC_SHA256 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256 = fromString("TLS_RSA_WITH_AES_128_CBC_SHA256");

    /** Static value TLS_RSA_WITH_AES_256_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_RSA_WITH_AES_256_CBC_SHA = fromString("TLS_RSA_WITH_AES_256_CBC_SHA");

    /** Static value TLS_RSA_WITH_AES_128_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_RSA_WITH_AES_128_CBC_SHA = fromString("TLS_RSA_WITH_AES_128_CBC_SHA");

    /** Static value TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = fromString("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");

    /** Static value TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = fromString("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");

    /** Static value TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = fromString("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");

    /** Static value TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = fromString("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");

    /** Static value TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = fromString("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");

    /** Static value TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = fromString("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");

    /** Static value TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = fromString("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");

    /** Static value TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = fromString("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");

    /** Static value TLS_DHE_DSS_WITH_AES_256_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA = fromString("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");

    /** Static value TLS_DHE_DSS_WITH_AES_128_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA = fromString("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");

    /** Static value TLS_RSA_WITH_3DES_EDE_CBC_SHA for ApplicationGatewaySslCipherSuite. */
    public static final ApplicationGatewaySslCipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA = fromString("TLS_RSA_WITH_3DES_EDE_CBC_SHA");

    /**
     * Creates or finds a ApplicationGatewaySslCipherSuite from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewaySslCipherSuite
     */
    @JsonCreator
    public static ApplicationGatewaySslCipherSuite fromString(String name) {
        return fromString(name, ApplicationGatewaySslCipherSuite.class);
    }

    /**
     * @return known ApplicationGatewaySslCipherSuite values
     */
    public static Collection<ApplicationGatewaySslCipherSuite> values() {
        return values(ApplicationGatewaySslCipherSuite.class);
    }
}
