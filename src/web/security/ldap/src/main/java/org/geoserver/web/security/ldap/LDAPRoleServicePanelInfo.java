/* Copyright (c) 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.web.security.ldap;

import org.geoserver.security.ldap.LDAPRoleService;
import org.geoserver.security.ldap.LDAPRoleServiceConfig;
import org.geoserver.web.security.ldap.LDAPRoleServicePanel;
import org.geoserver.security.web.role.RoleServicePanelInfo;

public class LDAPRoleServicePanelInfo extends RoleServicePanelInfo<LDAPRoleServiceConfig, LDAPRoleServicePanel> {

public LDAPRoleServicePanelInfo() {
    setComponentClass(LDAPRoleServicePanel.class);
    setServiceClass(LDAPRoleService.class);
    setServiceConfigClass(LDAPRoleServiceConfig.class);
}


}
