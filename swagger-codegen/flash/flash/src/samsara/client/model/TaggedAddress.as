package samsara.client.model {

import samsara.client.model.TaggedAddressBase;

    [XmlRootNode(name="TaggedAddress")]
    public class TaggedAddress {
        /* The ID of the address being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the address being tagged. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "TaggedAddress: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
