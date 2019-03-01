package samsara.client.model {


    [XmlRootNode(name="GroupParam")]
    public class GroupParam {
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;

    public function toString(): String {
        var str: String = "GroupParam: ";
        str += " (groupId: " + groupId + ")";
        return str;
    }

}

}
