package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.UserTagRoleTag;

    public class UserTagRoleList implements ListWrapper {
        // This declaration below of _UserTagRole_obj_class is to force flash compiler to include this class
        private var _userTagRole_obj_class: org.openapitools.client.model.UserTagRole = null;
        [XmlElements(name="userTagRole", type="org.openapitools.client.model.UserTagRole")]
        public var userTagRole: Array = new Array();

        public function getList(): Array{
            return userTagRole;
        }

}

}
