package samsara.client.model {


    [XmlRootNode(name="GroupDriversParam")]
    public class GroupDriversParam {
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;

    public function toString(): String {
        var str: String = "GroupDriversParam: ";
        str += " (groupId: " + groupId + ")";
        return str;
    }

}

}
