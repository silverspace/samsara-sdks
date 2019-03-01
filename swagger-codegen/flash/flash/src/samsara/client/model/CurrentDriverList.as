package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class CurrentDriverList implements ListWrapper {
        // This declaration below of _CurrentDriver_obj_class is to force flash compiler to include this class
        private var _currentDriver_obj_class: samsara.client.model.CurrentDriver = null;
        [XmlElements(name="currentDriver", type="samsara.client.model.CurrentDriver")]
        public var currentDriver: Array = new Array();

        public function getList(): Array{
            return currentDriver;
        }

}

}
