package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TaggedVehicleBaseList implements ListWrapper {
        // This declaration below of _TaggedVehicleBase_obj_class is to force flash compiler to include this class
        private var _taggedVehicleBase_obj_class: org.openapitools.client.model.TaggedVehicleBase = null;
        [XmlElements(name="taggedVehicleBase", type="org.openapitools.client.model.TaggedVehicleBase")]
        public var taggedVehicleBase: Array = new Array();

        public function getList(): Array{
            return taggedVehicleBase;
        }

}

}
