package samsara.client.model {


    [XmlRootNode(name="TagMetadata")]
    public class TagMetadata {
        /* The ID of this tag. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of this tag. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "TagMetadata: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
