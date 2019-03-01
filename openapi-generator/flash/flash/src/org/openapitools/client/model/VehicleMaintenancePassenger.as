package org.openapitools.client.model {

import org.openapitools.client.model.VehicleMaintenancePassengerCheckEngineLight;
import org.openapitools.client.model.VehicleMaintenancePassengerDiagnosticTroubleCodes;

    [XmlRootNode(name="VehicleMaintenancePassenger")]
    public class VehicleMaintenancePassenger {
                [XmlElement(name="checkEngineLight")]
        public var checkEngineLight: VehicleMaintenancePassengerCheckEngineLight = NaN;
        /* Passenger vehicle DTCs. */
        // This declaration below of _diagnosticTroubleCodes_obj_class is to force flash compiler to include this class
        private var _diagnosticTroubleCodes_obj_class: Array = null;
        [XmlElementWrapper(name="diagnosticTroubleCodes")]
        [XmlElements(name="diagnosticTroubleCodes", type="Array")]
                public var diagnosticTroubleCodes: Array = new Array();

    public function toString(): String {
        var str: String = "VehicleMaintenancePassenger: ";
        str += " (checkEngineLight: " + checkEngineLight + ")";
        str += " (diagnosticTroubleCodes: " + diagnosticTroubleCodes + ")";
        return str;
    }

}

}
