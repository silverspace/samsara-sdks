package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.UserBase;
import samsara.client.model.UserTagRole;

    public class UserList implements ListWrapper {
        // This declaration below of _User_obj_class is to force flash compiler to include this class
        private var _user_obj_class: samsara.client.model.User = null;
        [XmlElements(name="user", type="samsara.client.model.User")]
        public var user: Array = new Array();

        public function getList(): Array{
            return user;
        }

}

}
