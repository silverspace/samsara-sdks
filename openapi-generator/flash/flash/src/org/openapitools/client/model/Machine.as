package org.openapitools.client.model {


    [XmlRootNode(name="Machine")]
    public class Machine {
        /* ID of the machine. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the machine. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Notes about the machine */
        [XmlElement(name="notes")]
        public var notes: String = null;

    public function toString(): String {
        var str: String = "Machine: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (notes: " + notes + ")";
        return str;
    }

}

}
