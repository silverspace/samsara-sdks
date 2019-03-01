package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class VehicleMaintenancePassengerCheckEngineLightList implements ListWrapper {
        // This declaration below of _VehicleMaintenance_passenger_checkEngineLight_obj_class is to force flash compiler to include this class
        private var _vehicleMaintenancePassengerCheckEngineLight_obj_class: samsara.client.model.VehicleMaintenancePassengerCheckEngineLight = null;
        [XmlElements(name="vehicleMaintenancePassengerCheckEngineLight", type="samsara.client.model.VehicleMaintenancePassengerCheckEngineLight")]
        public var vehicleMaintenancePassengerCheckEngineLight: Array = new Array();

        public function getList(): Array{
            return vehicleMaintenancePassengerCheckEngineLight;
        }

}

}
