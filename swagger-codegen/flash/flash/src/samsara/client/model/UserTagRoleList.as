package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.UserTagRoleTag;

    public class UserTagRoleList implements ListWrapper {
        // This declaration below of _UserTagRole_obj_class is to force flash compiler to include this class
        private var _userTagRole_obj_class: samsara.client.model.UserTagRole = null;
        [XmlElements(name="userTagRole", type="samsara.client.model.UserTagRole")]
        public var userTagRole: Array = new Array();

        public function getList(): Array{
            return userTagRole;
        }

}

}
