package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class GroupDriversParamList implements ListWrapper {
        // This declaration below of _groupDriversParam_obj_class is to force flash compiler to include this class
        private var _groupDriversParam_obj_class: samsara.client.model.GroupDriversParam = null;
        [XmlElements(name="groupDriversParam", type="samsara.client.model.GroupDriversParam")]
        public var groupDriversParam: Array = new Array();

        public function getList(): Array{
            return groupDriversParam;
        }

}

}
