package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class GroupParamList implements ListWrapper {
        // This declaration below of _groupParam_obj_class is to force flash compiler to include this class
        private var _groupParam_obj_class: samsara.client.model.GroupParam = null;
        [XmlElements(name="groupParam", type="samsara.client.model.GroupParam")]
        public var groupParam: Array = new Array();

        public function getList(): Array{
            return groupParam;
        }

}

}
