package org.openapitools.client.model {


    [XmlRootNode(name="TaggedMachineBase")]
    public class TaggedMachineBase {
        /* The ID of the Machine being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "TaggedMachineBase: ";
        str += " (id: " + id + ")";
        return str;
    }

}

}
