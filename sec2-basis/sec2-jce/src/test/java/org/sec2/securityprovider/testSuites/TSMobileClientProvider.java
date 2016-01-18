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
package org.sec2.securityprovider.testSuites;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.sec2.securityprovider.mobileClient.*;

/**
 * Test suite for the security provider of the mobile client.
 *
 * @author Christopher Meyer - christopher.meyer@rub.de
 * @version 0.1
 *
 * Jun 10, 2011
 */
public class TSMobileClientProvider extends TestCase {

    public TSMobileClientProvider(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
     
        // Tests on Software Token
        suite.addTestSuite(SignatureSoftwareTests.class);
       suite.addTestSuite(KeyStoreSoftwareTests.class);
        suite.addTestSuite(CipherSoftwareTests.class);
        
        //Tests on Hardware Token
   /*     suite.addTestSuite(SignatureTests.class);   
        suite.addTestSuite(KeyStoreTests.class);    
        suite.addTestSuite(CipherTests.class);
   
        suite.addTestSuite(SecretKeyFactoryTests.class);*/
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
