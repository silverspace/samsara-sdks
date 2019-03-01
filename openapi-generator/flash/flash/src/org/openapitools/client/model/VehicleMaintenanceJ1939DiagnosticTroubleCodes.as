package org.openapitools.client.model {


    [XmlRootNode(name="VehicleMaintenanceJ1939DiagnosticTroubleCodes")]
    public class VehicleMaintenanceJ1939DiagnosticTroubleCodes {
                [XmlElement(name="spnDescription")]
        public var spnDescription: String = null;
                [XmlElement(name="fmiText")]
        public var fmiText: String = null;
                [XmlElement(name="spnId")]
        public var spnId: Number = 0;
                [XmlElement(name="occurrenceCount")]
        public var occurrenceCount: Number = 0;
                [XmlElement(name="txId")]
        public var txId: Number = 0;
                [XmlElement(name="fmiId")]
        public var fmiId: Number = 0;

    public function toString(): String {
        var str: String = "VehicleMaintenanceJ1939DiagnosticTroubleCodes: ";
        str += " (spnDescription: " + spnDescription + ")";
        str += " (fmiText: " + fmiText + ")";
        str += " (spnId: " + spnId + ")";
        str += " (occurrenceCount: " + occurrenceCount + ")";
        str += " (txId: " + txId + ")";
        str += " (fmiId: " + fmiId + ")";
        return str;
    }

}

}
