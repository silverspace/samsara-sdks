package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class UserRoleList implements ListWrapper {
        // This declaration below of _UserRole_obj_class is to force flash compiler to include this class
        private var _userRole_obj_class: org.openapitools.client.model.UserRole = null;
        [XmlElements(name="userRole", type="org.openapitools.client.model.UserRole")]
        public var userRole: Array = new Array();

        public function getList(): Array{
            return userRole;
        }

}

}
