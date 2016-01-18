/*
 * Copyright 2012 Ruhr-University Bochum, Chair for Network and Data Security
 *
 * This source code is part of the "Sec2" project and as this remains property
 * of the project partners. Content and concepts have to be treated as
 * CONFIDENTIAL. Publication or partly disclosure without explicit
 * written permission is prohibited.
 * For details on "Sec2" and its contributors visit
 *
 *        http://nds.rub.de/research/projects/sec2/
 */
package org.sec2.saml.client;

import java.util.Properties;
import org.sec2.saml.SAMLBaseConfig;

/**
 * Configuration of the SAML engine. Sets URL of the keyserver, etc.
 *
 * @author  Dennis Felsch - dennis.felsch@rub.de
 * @version 0.1
 *
 * December 17, 2012
 */
public class SAMLClientConfig extends SAMLBaseConfig {

    /**
     * No instances allowed, utility class only.
     */
    protected SAMLClientConfig() { }

    /**
     * Used to access the config file.
     */
    private static final Properties PROPERTIES = getPropertiesFromXML(
            "saml-client-config.xml");

    /**
     * URL of the keyserver.
     */
    public static final String SEC2_KEYSERVER_URL =
            PROPERTIES.getProperty("saml.client.keyserverURL");

    /**
     * Seconds a response's timestamp is allowed to differ from local clock.
     */
    public static final int ALLOWED_TIMESTAMP_OFFSET = Integer.parseInt(
            PROPERTIES.getProperty("saml.client.timestampOffset"));

    /**
     * Configuration of the recentIDs cache.
     */
    public static final String RECENT_IDS_CACHE_CONFIG = PROPERTIES.getProperty(
            "saml.client.recentIDsCacheConfig");

    /**
     * Configuration of the caches for groups and users.
     */
    public static final String MANAGERS_CACHE_CONFIG = PROPERTIES.getProperty(
            "saml.client.managersCacheConfig");

    /**
     * The subject of certificates generated by the client.
     */
    public static final String CERT_SUBJECT = PROPERTIES.getProperty(
            "saml.client.certificateSubject");
}
