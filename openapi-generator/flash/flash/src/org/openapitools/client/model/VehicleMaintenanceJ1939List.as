package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.VehicleMaintenanceJ1939CheckEngineLight;
import org.openapitools.client.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes;

    public class VehicleMaintenanceJ1939List implements ListWrapper {
        // This declaration below of _VehicleMaintenance_j1939_obj_class is to force flash compiler to include this class
        private var _vehicleMaintenanceJ1939_obj_class: org.openapitools.client.model.VehicleMaintenanceJ1939 = null;
        [XmlElements(name="vehicleMaintenanceJ1939", type="org.openapitools.client.model.VehicleMaintenanceJ1939")]
        public var vehicleMaintenanceJ1939: Array = new Array();

        public function getList(): Array{
            return vehicleMaintenanceJ1939;
        }

}

}
