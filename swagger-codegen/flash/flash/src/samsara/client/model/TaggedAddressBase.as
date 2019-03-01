package samsara.client.model {


    [XmlRootNode(name="TaggedAddressBase")]
    public class TaggedAddressBase {
        /* The ID of the address being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "TaggedAddressBase: ";
        str += " (id: " + id + ")";
        return str;
    }

}

}
