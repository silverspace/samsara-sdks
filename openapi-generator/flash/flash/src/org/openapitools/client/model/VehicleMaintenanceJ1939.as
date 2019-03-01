package org.openapitools.client.model {

import org.openapitools.client.model.VehicleMaintenanceJ1939CheckEngineLight;
import org.openapitools.client.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes;

    [XmlRootNode(name="VehicleMaintenanceJ1939")]
    public class VehicleMaintenanceJ1939 {
                [XmlElement(name="checkEngineLight")]
        public var checkEngineLight: VehicleMaintenanceJ1939CheckEngineLight = NaN;
        /* J1939 DTCs. */
        // This declaration below of _diagnosticTroubleCodes_obj_class is to force flash compiler to include this class
        private var _diagnosticTroubleCodes_obj_class: Array = null;
        [XmlElementWrapper(name="diagnosticTroubleCodes")]
        [XmlElements(name="diagnosticTroubleCodes", type="Array")]
                public var diagnosticTroubleCodes: Array = new Array();

    public function toString(): String {
        var str: String = "VehicleMaintenanceJ1939: ";
        str += " (checkEngineLight: " + checkEngineLight + ")";
        str += " (diagnosticTroubleCodes: " + diagnosticTroubleCodes + ")";
        return str;
    }

}

}
