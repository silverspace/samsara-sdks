package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class VehicleHarshEventResponseLocationList implements ListWrapper {
        // This declaration below of _VehicleHarshEventResponse_location_obj_class is to force flash compiler to include this class
        private var _vehicleHarshEventResponseLocation_obj_class: samsara.client.model.VehicleHarshEventResponseLocation = null;
        [XmlElements(name="vehicleHarshEventResponseLocation", type="samsara.client.model.VehicleHarshEventResponseLocation")]
        public var vehicleHarshEventResponseLocation: Array = new Array();

        public function getList(): Array{
            return vehicleHarshEventResponseLocation;
        }

}

}
