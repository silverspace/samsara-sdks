package samsara.client.model {


    [XmlRootNode(name="HosLogsParam2")]
    public class HosLogsParam2 {
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;

    public function toString(): String {
        var str: String = "HosLogsParam2: ";
        str += " (groupId: " + groupId + ")";
        return str;
    }

}

}
