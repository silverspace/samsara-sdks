package samsara.client.model {


    [XmlRootNode(name="VehicleMaintenancePassengerDiagnosticTroubleCodes")]
    public class VehicleMaintenancePassengerDiagnosticTroubleCodes {
                [XmlElement(name="dtcDescription")]
        public var dtcDescription: String = null;
                [XmlElement(name="dtcId")]
        public var dtcId: Number = NaN;
                [XmlElement(name="dtcShortCode")]
        public var dtcShortCode: String = null;

    public function toString(): String {
        var str: String = "VehicleMaintenancePassengerDiagnosticTroubleCodes: ";
        str += " (dtcDescription: " + dtcDescription + ")";
        str += " (dtcId: " + dtcId + ")";
        str += " (dtcShortCode: " + dtcShortCode + ")";
        return str;
    }

}

}
