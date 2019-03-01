package org.openapitools.client.model {


    [XmlRootNode(name="VehicleMaintenancePassengerDiagnosticTroubleCodes")]
    public class VehicleMaintenancePassengerDiagnosticTroubleCodes {
                [XmlElement(name="dtcShortCode")]
        public var dtcShortCode: String = null;
                [XmlElement(name="dtcId")]
        public var dtcId: Number = 0;
                [XmlElement(name="dtcDescription")]
        public var dtcDescription: String = null;

    public function toString(): String {
        var str: String = "VehicleMaintenancePassengerDiagnosticTroubleCodes: ";
        str += " (dtcShortCode: " + dtcShortCode + ")";
        str += " (dtcId: " + dtcId + ")";
        str += " (dtcDescription: " + dtcDescription + ")";
        return str;
    }

}

}
