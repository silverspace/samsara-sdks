package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class VehicleMaintenancePassengerCheckEngineLightList implements ListWrapper {
        // This declaration below of _VehicleMaintenance_passenger_checkEngineLight_obj_class is to force flash compiler to include this class
        private var _vehicleMaintenancePassengerCheckEngineLight_obj_class: org.openapitools.client.model.VehicleMaintenancePassengerCheckEngineLight = null;
        [XmlElements(name="vehicleMaintenancePassengerCheckEngineLight", type="org.openapitools.client.model.VehicleMaintenancePassengerCheckEngineLight")]
        public var vehicleMaintenancePassengerCheckEngineLight: Array = new Array();

        public function getList(): Array{
            return vehicleMaintenancePassengerCheckEngineLight;
        }

}

}
