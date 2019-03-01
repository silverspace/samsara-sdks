package org.openapitools.client.model {


    [XmlRootNode(name="InlineObject8")]
    public class InlineObject8 {
        /* Driver ID to query. */
        [XmlElement(name="driverId")]
        public var driverId: Number = 0;
        /* End of the time range, specified in milliseconds UNIX time. */
        [XmlElement(name="endMs")]
        public var endMs: Number = 0;
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* Beginning of the time range, specified in milliseconds UNIX time. */
        [XmlElement(name="startMs")]
        public var startMs: Number = 0;

    public function toString(): String {
        var str: String = "InlineObject8: ";
        str += " (driverId: " + driverId + ")";
        str += " (endMs: " + endMs + ")";
        str += " (groupId: " + groupId + ")";
        str += " (startMs: " + startMs + ")";
        return str;
    }

}

}
