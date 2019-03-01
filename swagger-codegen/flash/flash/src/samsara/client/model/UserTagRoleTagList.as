package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class UserTagRoleTagList implements ListWrapper {
        // This declaration below of _UserTagRole_tag_obj_class is to force flash compiler to include this class
        private var _userTagRoleTag_obj_class: samsara.client.model.UserTagRoleTag = null;
        [XmlElements(name="userTagRoleTag", type="samsara.client.model.UserTagRoleTag")]
        public var userTagRoleTag: Array = new Array();

        public function getList(): Array{
            return userTagRoleTag;
        }

}

}
