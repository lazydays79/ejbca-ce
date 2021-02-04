/*************************************************************************
 *                                                                       *
 *  EJBCA Community: The OpenSource Certificate Authority                *
 *                                                                       *
 *  This software is free software; you can redistribute it and/or       *
 *  modify it under the terms of the GNU Lesser General Public           *
 *  License as published by the Free Software Foundation; either         *
 *  version 2.1 of the License, or any later version.                    *
 *                                                                       *
 *  See terms of license at gnu.org.                                     *
 *                                                                       *
 *************************************************************************/

package org.ejbca.core.protocol.msae;

import java.util.List;

import javax.ejb.Local;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.cesecore.config.MSAutoEnrollmentSettingsTemplate;

@Local
public interface ADConnectionSingletonLocal {

    default void updateConnectionProperties() throws LDAPException {
        throw new UnsupportedOperationException("ADConnection calls are only supported in EJBCA Enterprise");
    }
    
    
    default NamingEnumeration<SearchResult> getEntryNamedContext(String searchBase, String searchFilter, SearchControls searchCtls, String domain) 
            throws NamingException {
        throw new UnsupportedOperationException("ADConnection calls are only supported in EJBCA Enterprise");
    }

    default void testConnection(String domain, int port, String loginDN, String loginPassword, boolean useSSL) throws LDAPException {
        throw new UnsupportedOperationException("ADConnection calls are only supported in EJBCA Enterprise");
    }


    default List<MSAutoEnrollmentSettingsTemplate> getCertificateTemplateSettings() {
        throw new UnsupportedOperationException("ADConnection calls are only supported in EJBCA Enterprise");
    }


    default NamingEnumeration<SearchResult> getEntryNamedContext(String searchBase, String searchFilter, SearchControls searchCtls) throws LDAPException {
        throw new UnsupportedOperationException("ADConnection calls are only supported in EJBCA Enterprise");
    }
}