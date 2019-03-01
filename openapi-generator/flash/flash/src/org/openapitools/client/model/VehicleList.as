package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class VehicleList implements ListWrapper {
        // This declaration below of _Vehicle_obj_class is to force flash compiler to include this class
        private var _vehicle_obj_class: org.openapitools.client.model.Vehicle = null;
        [XmlElements(name="vehicle", type="org.openapitools.client.model.Vehicle")]
        public var vehicle: Array = new Array();

        public function getList(): Array{
            return vehicle;
        }

}

}
