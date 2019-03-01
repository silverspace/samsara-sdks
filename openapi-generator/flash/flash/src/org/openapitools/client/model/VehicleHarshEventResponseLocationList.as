package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class VehicleHarshEventResponseLocationList implements ListWrapper {
        // This declaration below of _VehicleHarshEventResponse_location_obj_class is to force flash compiler to include this class
        private var _vehicleHarshEventResponseLocation_obj_class: org.openapitools.client.model.VehicleHarshEventResponseLocation = null;
        [XmlElements(name="vehicleHarshEventResponseLocation", type="org.openapitools.client.model.VehicleHarshEventResponseLocation")]
        public var vehicleHarshEventResponseLocation: Array = new Array();

        public function getList(): Array{
            return vehicleHarshEventResponseLocation;
        }

}

}
