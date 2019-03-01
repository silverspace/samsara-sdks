package samsara.client.model {


    [XmlRootNode(name="SafetyReportHarshEvent")]
    public class SafetyReportHarshEvent {
        /* Type of the harsh event */
        [XmlElement(name="harshEventType")]
        public var harshEventType: String = null;
        /* Timestamp that the harsh event occurred in Unix milliseconds since epoch */
        [XmlElement(name="timestampMs")]
        public var timestampMs: Number = NaN;
        /* Vehicle associated with the harsh event */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = NaN;

    public function toString(): String {
        var str: String = "SafetyReportHarshEvent: ";
        str += " (harshEventType: " + harshEventType + ")";
        str += " (timestampMs: " + timestampMs + ")";
        str += " (vehicleId: " + vehicleId + ")";
        return str;
    }

}

}
