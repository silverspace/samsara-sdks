package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class VehicleList implements ListWrapper {
        // This declaration below of _Vehicle_obj_class is to force flash compiler to include this class
        private var _vehicle_obj_class: samsara.client.model.Vehicle = null;
        [XmlElements(name="vehicle", type="samsara.client.model.Vehicle")]
        public var vehicle: Array = new Array();

        public function getList(): Array{
            return vehicle;
        }

}

}
