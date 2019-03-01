package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.VehicleHarshEventResponseLocation;

    public class VehicleHarshEventResponseList implements ListWrapper {
        // This declaration below of _VehicleHarshEventResponse_obj_class is to force flash compiler to include this class
        private var _vehicleHarshEventResponse_obj_class: samsara.client.model.VehicleHarshEventResponse = null;
        [XmlElements(name="vehicleHarshEventResponse", type="samsara.client.model.VehicleHarshEventResponse")]
        public var vehicleHarshEventResponse: Array = new Array();

        public function getList(): Array{
            return vehicleHarshEventResponse;
        }

}

}
