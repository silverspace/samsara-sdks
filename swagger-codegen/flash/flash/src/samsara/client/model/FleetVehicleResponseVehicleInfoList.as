package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class FleetVehicleResponseVehicleInfoList implements ListWrapper {
        // This declaration below of _FleetVehicleResponse_vehicleInfo_obj_class is to force flash compiler to include this class
        private var _fleetVehicleResponseVehicleInfo_obj_class: samsara.client.model.FleetVehicleResponseVehicleInfo = null;
        [XmlElements(name="fleetVehicleResponseVehicleInfo", type="samsara.client.model.FleetVehicleResponseVehicleInfo")]
        public var fleetVehicleResponseVehicleInfo: Array = new Array();

        public function getList(): Array{
            return fleetVehicleResponseVehicleInfo;
        }

}

}
