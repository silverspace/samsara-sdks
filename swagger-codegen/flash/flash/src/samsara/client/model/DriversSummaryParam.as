package samsara.client.model {


    [XmlRootNode(name="DriversSummaryParam")]
    public class DriversSummaryParam {
        /* End time (ms) of queried time period. */
        [XmlElement(name="endMs")]
        public var endMs: Number = 0;
        /* Org ID to query. */
        [XmlElement(name="orgId")]
        public var orgId: Number = 0;
        /* Start time (ms) of queried time period. */
        [XmlElement(name="startMs")]
        public var startMs: Number = 0;

    public function toString(): String {
        var str: String = "DriversSummaryParam: ";
        str += " (endMs: " + endMs + ")";
        str += " (orgId: " + orgId + ")";
        str += " (startMs: " + startMs + ")";
        return str;
    }

}

}
