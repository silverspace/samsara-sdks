package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class TaggedVehicleBaseList implements ListWrapper {
        // This declaration below of _TaggedVehicleBase_obj_class is to force flash compiler to include this class
        private var _taggedVehicleBase_obj_class: samsara.client.model.TaggedVehicleBase = null;
        [XmlElements(name="taggedVehicleBase", type="samsara.client.model.TaggedVehicleBase")]
        public var taggedVehicleBase: Array = new Array();

        public function getList(): Array{
            return taggedVehicleBase;
        }

}

}
