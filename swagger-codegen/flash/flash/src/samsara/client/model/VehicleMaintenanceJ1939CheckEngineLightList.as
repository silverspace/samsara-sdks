package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class VehicleMaintenanceJ1939CheckEngineLightList implements ListWrapper {
        // This declaration below of _VehicleMaintenance_j1939_checkEngineLight_obj_class is to force flash compiler to include this class
        private var _vehicleMaintenanceJ1939CheckEngineLight_obj_class: samsara.client.model.VehicleMaintenanceJ1939CheckEngineLight = null;
        [XmlElements(name="vehicleMaintenanceJ1939CheckEngineLight", type="samsara.client.model.VehicleMaintenanceJ1939CheckEngineLight")]
        public var vehicleMaintenanceJ1939CheckEngineLight: Array = new Array();

        public function getList(): Array{
            return vehicleMaintenanceJ1939CheckEngineLight;
        }

}

}
