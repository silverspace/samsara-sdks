package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.FleetVehicleLocation;

    public class FleetVehicleLocationsList implements ListWrapper {
        // This declaration below of _FleetVehicleLocations_obj_class is to force flash compiler to include this class
        private var _fleetVehicleLocations_obj_class: samsara.client.model.FleetVehicleLocations = null;
        [XmlElements(name="fleetVehicleLocations", type="samsara.client.model.FleetVehicleLocations")]
        public var fleetVehicleLocations: Array = new Array();

        public function getList(): Array{
            return fleetVehicleLocations;
        }

}

}
