package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class VehicleMaintenancePassengerDiagnosticTroubleCodesList implements ListWrapper {
        // This declaration below of _VehicleMaintenance_passenger_diagnosticTroubleCodes_obj_class is to force flash compiler to include this class
        private var _vehicleMaintenancePassengerDiagnosticTroubleCodes_obj_class: org.openapitools.client.model.VehicleMaintenancePassengerDiagnosticTroubleCodes = null;
        [XmlElements(name="vehicleMaintenancePassengerDiagnosticTroubleCodes", type="org.openapitools.client.model.VehicleMaintenancePassengerDiagnosticTroubleCodes")]
        public var vehicleMaintenancePassengerDiagnosticTroubleCodes: Array = new Array();

        public function getList(): Array{
            return vehicleMaintenancePassengerDiagnosticTroubleCodes;
        }

}

}
