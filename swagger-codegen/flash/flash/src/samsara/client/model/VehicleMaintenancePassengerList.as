package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.VehicleMaintenancePassengerCheckEngineLight;
import samsara.client.model.VehicleMaintenancePassengerDiagnosticTroubleCodes;

    public class VehicleMaintenancePassengerList implements ListWrapper {
        // This declaration below of _VehicleMaintenance_passenger_obj_class is to force flash compiler to include this class
        private var _vehicleMaintenancePassenger_obj_class: samsara.client.model.VehicleMaintenancePassenger = null;
        [XmlElements(name="vehicleMaintenancePassenger", type="samsara.client.model.VehicleMaintenancePassenger")]
        public var vehicleMaintenancePassenger: Array = new Array();

        public function getList(): Array{
            return vehicleMaintenancePassenger;
        }

}

}
