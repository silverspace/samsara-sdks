package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class UserRoleList implements ListWrapper {
        // This declaration below of _UserRole_obj_class is to force flash compiler to include this class
        private var _userRole_obj_class: samsara.client.model.UserRole = null;
        [XmlElements(name="userRole", type="samsara.client.model.UserRole")]
        public var userRole: Array = new Array();

        public function getList(): Array{
            return userRole;
        }

}

}
