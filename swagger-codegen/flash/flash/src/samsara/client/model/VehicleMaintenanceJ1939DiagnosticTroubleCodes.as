package samsara.client.model {


    [XmlRootNode(name="VehicleMaintenanceJ1939DiagnosticTroubleCodes")]
    public class VehicleMaintenanceJ1939DiagnosticTroubleCodes {
                [XmlElement(name="fmiId")]
        public var fmiId: Number = NaN;
                [XmlElement(name="fmiText")]
        public var fmiText: String = null;
                [XmlElement(name="occurrenceCount")]
        public var occurrenceCount: Number = NaN;
                [XmlElement(name="spnDescription")]
        public var spnDescription: String = null;
                [XmlElement(name="spnId")]
        public var spnId: Number = NaN;
                [XmlElement(name="txId")]
        public var txId: Number = NaN;

    public function toString(): String {
        var str: String = "VehicleMaintenanceJ1939DiagnosticTroubleCodes: ";
        str += " (fmiId: " + fmiId + ")";
        str += " (fmiText: " + fmiText + ")";
        str += " (occurrenceCount: " + occurrenceCount + ")";
        str += " (spnDescription: " + spnDescription + ")";
        str += " (spnId: " + spnId + ")";
        str += " (txId: " + txId + ")";
        return str;
    }

}

}
