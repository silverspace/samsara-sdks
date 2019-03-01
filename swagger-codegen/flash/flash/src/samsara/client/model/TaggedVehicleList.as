package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedVehicleBase;

    public class TaggedVehicleList implements ListWrapper {
        // This declaration below of _TaggedVehicle_obj_class is to force flash compiler to include this class
        private var _taggedVehicle_obj_class: samsara.client.model.TaggedVehicle = null;
        [XmlElements(name="taggedVehicle", type="samsara.client.model.TaggedVehicle")]
        public var taggedVehicle: Array = new Array();

        public function getList(): Array{
            return taggedVehicle;
        }

}

}
