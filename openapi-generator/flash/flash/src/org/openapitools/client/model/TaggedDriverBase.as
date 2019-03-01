package org.openapitools.client.model {


    [XmlRootNode(name="TaggedDriverBase")]
    public class TaggedDriverBase {
        /* The ID of the Driver being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "TaggedDriverBase: ";
        str += " (id: " + id + ")";
        return str;
    }

}

}
