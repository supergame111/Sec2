/*
 * Copyright 2011 Sec2 Consortium
 *
 * This source code is part of the "Sec2" project and as this remains property
 * of the project partners. Content and concepts have to be treated as
 * CONFIDENTIAL. Publication or partly disclosure without explicit written
 * permission is prohibited.
 * For details on "Sec2" and its contributors visit
 *
 *        http://www.sec2.org
 */
package org.sec2.securityprovider.mobileclient;

import org.sec2.securityprovider.MobileClientCommons;
import org.sec2.securityprovider.serviceparameter.TokenType;

/**
 * Concrete instantiation of the KeyStore tests.
 * @author  Jan Temme - Jan.Temme@rub.de
 * @version 0.1
 * Jun 8, 2012
 */
public class KeyStoreTests extends KeyStoreTestImpovedImpl {

    /**
     * Initialize the test class.
     */
    public KeyStoreTests() {
        super(MobileClientCommons.getInstance(TokenType.HARDWARE_TOKEN).getProvider());
        
    }
}
