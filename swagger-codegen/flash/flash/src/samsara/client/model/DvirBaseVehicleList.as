package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DvirBaseVehicleList implements ListWrapper {
        // This declaration below of _DvirBase_vehicle_obj_class is to force flash compiler to include this class
        private var _dvirBaseVehicle_obj_class: samsara.client.model.DvirBaseVehicle = null;
        [XmlElements(name="dvirBaseVehicle", type="samsara.client.model.DvirBaseVehicle")]
        public var dvirBaseVehicle: Array = new Array();

        public function getList(): Array{
            return dvirBaseVehicle;
        }

}

}
