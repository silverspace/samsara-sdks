package samsara.client.model {


    [XmlRootNode(name="DoorResponseSensors")]
    public class DoorResponseSensors {
        /* Flag indicating whether the current door is closed or open. */
        [XmlElement(name="doorClosed")]
        public var doorClosed: Boolean = false;
        /* ID of the sensor. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the sensor. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "DoorResponseSensors: ";
        str += " (doorClosed: " + doorClosed + ")";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
