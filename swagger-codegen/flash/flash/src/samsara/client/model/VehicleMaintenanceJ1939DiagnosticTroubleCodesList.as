package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class VehicleMaintenanceJ1939DiagnosticTroubleCodesList implements ListWrapper {
        // This declaration below of _VehicleMaintenance_j1939_diagnosticTroubleCodes_obj_class is to force flash compiler to include this class
        private var _vehicleMaintenanceJ1939DiagnosticTroubleCodes_obj_class: samsara.client.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes = null;
        [XmlElements(name="vehicleMaintenanceJ1939DiagnosticTroubleCodes", type="samsara.client.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes")]
        public var vehicleMaintenanceJ1939DiagnosticTroubleCodes: Array = new Array();

        public function getList(): Array{
            return vehicleMaintenanceJ1939DiagnosticTroubleCodes;
        }

}

}
