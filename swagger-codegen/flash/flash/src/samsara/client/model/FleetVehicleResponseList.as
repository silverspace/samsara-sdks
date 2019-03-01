package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.FleetVehicleResponseVehicleInfo;

    public class FleetVehicleResponseList implements ListWrapper {
        // This declaration below of _FleetVehicleResponse_obj_class is to force flash compiler to include this class
        private var _fleetVehicleResponse_obj_class: samsara.client.model.FleetVehicleResponse = null;
        [XmlElements(name="fleetVehicleResponse", type="samsara.client.model.FleetVehicleResponse")]
        public var fleetVehicleResponse: Array = new Array();

        public function getList(): Array{
            return fleetVehicleResponse;
        }

}

}
