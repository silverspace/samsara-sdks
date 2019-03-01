package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class FleetVehicleLocationList implements ListWrapper {
        // This declaration below of _FleetVehicleLocation_obj_class is to force flash compiler to include this class
        private var _fleetVehicleLocation_obj_class: samsara.client.model.FleetVehicleLocation = null;
        [XmlElements(name="fleetVehicleLocation", type="samsara.client.model.FleetVehicleLocation")]
        public var fleetVehicleLocation: Array = new Array();

        public function getList(): Array{
            return fleetVehicleLocation;
        }

}

}
