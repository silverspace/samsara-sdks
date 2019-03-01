package samsara.client.model {


    [XmlRootNode(name="TripsParam")]
    public class TripsParam {
        /* End of the time range, specified in milliseconds UNIX time. */
        [XmlElement(name="endMs")]
        public var endMs: Number = NaN;
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs */
        [XmlElement(name="startMs")]
        public var startMs: Number = NaN;
        /* Vehicle ID to query. */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = 0;

    public function toString(): String {
        var str: String = "TripsParam: ";
        str += " (endMs: " + endMs + ")";
        str += " (groupId: " + groupId + ")";
        str += " (startMs: " + startMs + ")";
        str += " (vehicleId: " + vehicleId + ")";
        return str;
    }

}

}
