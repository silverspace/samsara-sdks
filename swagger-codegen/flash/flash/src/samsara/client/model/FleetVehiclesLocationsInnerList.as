package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.FleetVehicleLocations;

    public class FleetVehiclesLocationsInnerList implements ListWrapper {
        // This declaration below of _FleetVehiclesLocations_inner_obj_class is to force flash compiler to include this class
        private var _fleetVehiclesLocationsInner_obj_class: samsara.client.model.FleetVehiclesLocationsInner = null;
        [XmlElements(name="fleetVehiclesLocationsInner", type="samsara.client.model.FleetVehiclesLocationsInner")]
        public var fleetVehiclesLocationsInner: Array = new Array();

        public function getList(): Array{
            return fleetVehiclesLocationsInner;
        }

}

}
