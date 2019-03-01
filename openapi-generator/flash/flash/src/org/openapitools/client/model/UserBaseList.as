package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class UserBaseList implements ListWrapper {
        // This declaration below of _UserBase_obj_class is to force flash compiler to include this class
        private var _userBase_obj_class: org.openapitools.client.model.UserBase = null;
        [XmlElements(name="userBase", type="org.openapitools.client.model.UserBase")]
        public var userBase: Array = new Array();

        public function getList(): Array{
            return userBase;
        }

}

}
