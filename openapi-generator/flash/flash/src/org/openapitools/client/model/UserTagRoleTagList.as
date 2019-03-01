package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class UserTagRoleTagList implements ListWrapper {
        // This declaration below of _UserTagRole_tag_obj_class is to force flash compiler to include this class
        private var _userTagRoleTag_obj_class: org.openapitools.client.model.UserTagRoleTag = null;
        [XmlElements(name="userTagRoleTag", type="org.openapitools.client.model.UserTagRoleTag")]
        public var userTagRoleTag: Array = new Array();

        public function getList(): Array{
            return userTagRoleTag;
        }

}

}
