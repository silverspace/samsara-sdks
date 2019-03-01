package samsara.client.model {


    [XmlRootNode(name="AddressParam")]
    public class AddressParam {
        /* The address of the entry to add, as it would be recognized if provided to maps.google.com. */
        [XmlElement(name="address")]
        public var address: String = null;
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* Name of the location to add to the address book. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Radius in meters of the address (used for matching vehicle trip stops to this location). */
        [XmlElement(name="radius")]
        public var radius: Number = NaN;

    public function toString(): String {
        var str: String = "AddressParam: ";
        str += " (address: " + address + ")";
        str += " (groupId: " + groupId + ")";
        str += " (name: " + name + ")";
        str += " (radius: " + radius + ")";
        return str;
    }

}

}
