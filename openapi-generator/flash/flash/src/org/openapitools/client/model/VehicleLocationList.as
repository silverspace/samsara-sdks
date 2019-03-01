package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class VehicleLocationList implements ListWrapper {
        // This declaration below of _VehicleLocation_obj_class is to force flash compiler to include this class
        private var _vehicleLocation_obj_class: org.openapitools.client.model.VehicleLocation = null;
        [XmlElements(name="vehicleLocation", type="org.openapitools.client.model.VehicleLocation")]
        public var vehicleLocation: Array = new Array();

        public function getList(): Array{
            return vehicleLocation;
        }

}

}
