package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class FleetVehicleLocationList implements ListWrapper {
        // This declaration below of _FleetVehicleLocation_obj_class is to force flash compiler to include this class
        private var _fleetVehicleLocation_obj_class: org.openapitools.client.model.FleetVehicleLocation = null;
        [XmlElements(name="fleetVehicleLocation", type="org.openapitools.client.model.FleetVehicleLocation")]
        public var fleetVehicleLocation: Array = new Array();

        public function getList(): Array{
            return fleetVehicleLocation;
        }

}

}
