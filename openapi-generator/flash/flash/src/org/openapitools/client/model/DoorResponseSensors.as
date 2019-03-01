package org.openapitools.client.model {


    [XmlRootNode(name="DoorResponseSensors")]
    public class DoorResponseSensors {
        /* Flag indicating whether the current door is closed or open. */
        [XmlElement(name="doorClosed")]
        public var doorClosed: Boolean = false;
        /* Name of the sensor. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* ID of the sensor. */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "DoorResponseSensors: ";
        str += " (doorClosed: " + doorClosed + ")";
        str += " (name: " + name + ")";
        str += " (id: " + id + ")";
        return str;
    }

}

}
