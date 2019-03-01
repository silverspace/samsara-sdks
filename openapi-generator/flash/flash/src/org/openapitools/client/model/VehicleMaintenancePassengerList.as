package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.VehicleMaintenancePassengerCheckEngineLight;
import org.openapitools.client.model.VehicleMaintenancePassengerDiagnosticTroubleCodes;

    public class VehicleMaintenancePassengerList implements ListWrapper {
        // This declaration below of _VehicleMaintenance_passenger_obj_class is to force flash compiler to include this class
        private var _vehicleMaintenancePassenger_obj_class: org.openapitools.client.model.VehicleMaintenancePassenger = null;
        [XmlElements(name="vehicleMaintenancePassenger", type="org.openapitools.client.model.VehicleMaintenancePassenger")]
        public var vehicleMaintenancePassenger: Array = new Array();

        public function getList(): Array{
            return vehicleMaintenancePassenger;
        }

}

}
