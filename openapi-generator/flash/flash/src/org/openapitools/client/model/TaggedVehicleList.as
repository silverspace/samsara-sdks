package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaggedVehicleBase;

    public class TaggedVehicleList implements ListWrapper {
        // This declaration below of _TaggedVehicle_obj_class is to force flash compiler to include this class
        private var _taggedVehicle_obj_class: org.openapitools.client.model.TaggedVehicle = null;
        [XmlElements(name="taggedVehicle", type="org.openapitools.client.model.TaggedVehicle")]
        public var taggedVehicle: Array = new Array();

        public function getList(): Array{
            return taggedVehicle;
        }

}

}
