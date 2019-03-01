package org.openapitools.client.model {


    [XmlRootNode(name="InlineObject17")]
    public class InlineObject17 {
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
        var str: String = "InlineObject17: ";
        str += " (endMs: " + endMs + ")";
        str += " (groupId: " + groupId + ")";
        str += " (startMs: " + startMs + ")";
        return str;
    }

}

}
