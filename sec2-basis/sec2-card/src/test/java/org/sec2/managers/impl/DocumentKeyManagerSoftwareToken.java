/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sec2.managers.impl;

import org.sec2.securityprovider.serviceparameter.TokenType;

/**
 *
 * @author Thorsten Schreiber <thorsten.schreiber@rub.de>
 */
public class DocumentKeyManagerSoftwareToken extends DocumentKeyManagerTests{

 static {
      TOKEN_TYPE = TokenType.SOFTWARE_TOKEN;
     
 }
    
}
