package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class UserBaseList implements ListWrapper {
        // This declaration below of _UserBase_obj_class is to force flash compiler to include this class
        private var _userBase_obj_class: samsara.client.model.UserBase = null;
        [XmlElements(name="userBase", type="samsara.client.model.UserBase")]
        public var userBase: Array = new Array();

        public function getList(): Array{
            return userBase;
        }

}

}
