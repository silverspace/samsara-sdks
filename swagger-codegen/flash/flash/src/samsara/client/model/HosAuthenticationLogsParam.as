package samsara.client.model {


    [XmlRootNode(name="HosAuthenticationLogsParam")]
    public class HosAuthenticationLogsParam {
        /* Driver ID to query. */
        [XmlElement(name="driverId")]
        public var driverId: Number = 0;
        /* End of the time range, specified in milliseconds UNIX time. */
        [XmlElement(name="endMs")]
        public var endMs: Number = NaN;
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* Beginning of the time range, specified in milliseconds UNIX time. */
        [XmlElement(name="startMs")]
        public var startMs: Number = NaN;

    public function toString(): String {
        var str: String = "HosAuthenticationLogsParam: ";
        str += " (driverId: " + driverId + ")";
        str += " (endMs: " + endMs + ")";
        str += " (groupId: " + groupId + ")";
        str += " (startMs: " + startMs + ")";
        return str;
    }

}

}
