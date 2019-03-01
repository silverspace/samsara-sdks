package samsara.client.model {


    [XmlRootNode(name="TaggedSensorBase")]
    public class TaggedSensorBase {
        /* The ID of the Sensor being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "TaggedSensorBase: ";
        str += " (id: " + id + ")";
        return str;
    }

}

}
