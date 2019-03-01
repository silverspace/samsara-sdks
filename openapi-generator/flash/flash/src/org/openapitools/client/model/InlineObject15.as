package org.openapitools.client.model {


    [XmlRootNode(name="InlineObject15")]
    public class InlineObject15 {
        /* End of the time range, specified in milliseconds UNIX time. */
        [XmlElement(name="endMs")]
        public var endMs: Number = 0;
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs */
        [XmlElement(name="startMs")]
        public var startMs: Number = 0;
        /* Vehicle ID to query. */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = 0;

    public function toString(): String {
        var str: String = "InlineObject15: ";
        str += " (endMs: " + endMs + ")";
        str += " (groupId: " + groupId + ")";
        str += " (startMs: " + startMs + ")";
        str += " (vehicleId: " + vehicleId + ")";
        return str;
    }

}

}
