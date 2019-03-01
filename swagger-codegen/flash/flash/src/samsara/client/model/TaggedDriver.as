package samsara.client.model {

import samsara.client.model.TaggedDriverBase;

    [XmlRootNode(name="TaggedDriver")]
    public class TaggedDriver {
        /* The ID of the Driver being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the Driver being tagged. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "TaggedDriver: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
