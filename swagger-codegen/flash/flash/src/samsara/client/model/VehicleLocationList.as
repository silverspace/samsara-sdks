package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class VehicleLocationList implements ListWrapper {
        // This declaration below of _VehicleLocation_obj_class is to force flash compiler to include this class
        private var _vehicleLocation_obj_class: samsara.client.model.VehicleLocation = null;
        [XmlElements(name="vehicleLocation", type="samsara.client.model.VehicleLocation")]
        public var vehicleLocation: Array = new Array();

        public function getList(): Array{
            return vehicleLocation;
        }

}

}
