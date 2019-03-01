package samsara.client.model {

import samsara.client.model.TaggedMachineBase;

    [XmlRootNode(name="TaggedMachine")]
    public class TaggedMachine {
        /* The ID of the Machine being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the Machine being tagged. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "TaggedMachine: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
