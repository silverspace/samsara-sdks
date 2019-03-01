package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.FleetVehiclesLocationsInner;

    public class FleetVehiclesLocationsList implements ListWrapper {
        // This declaration below of _FleetVehiclesLocations_obj_class is to force flash compiler to include this class
        private var _fleetVehiclesLocations_obj_class: samsara.client.model.FleetVehiclesLocations = null;
        [XmlElements(name="fleetVehiclesLocations", type="samsara.client.model.FleetVehiclesLocations")]
        public var fleetVehiclesLocations: Array = new Array();

        public function getList(): Array{
            return fleetVehiclesLocations;
        }

}

}
