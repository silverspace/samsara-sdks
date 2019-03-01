package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.FleetVehicleResponseVehicleInfo;

    public class FleetVehicleResponseList implements ListWrapper {
        // This declaration below of _FleetVehicleResponse_obj_class is to force flash compiler to include this class
        private var _fleetVehicleResponse_obj_class: org.openapitools.client.model.FleetVehicleResponse = null;
        [XmlElements(name="fleetVehicleResponse", type="org.openapitools.client.model.FleetVehicleResponse")]
        public var fleetVehicleResponse: Array = new Array();

        public function getList(): Array{
            return fleetVehicleResponse;
        }

}

}
