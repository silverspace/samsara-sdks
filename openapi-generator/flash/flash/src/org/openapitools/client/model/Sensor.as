package org.openapitools.client.model {


    [XmlRootNode(name="Sensor")]
    public class Sensor {
        /* ID of the sensor. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* MAC address of the sensor. */
        [XmlElement(name="macAddress")]
        public var macAddress: String = null;
        /* Name of the sensor. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "Sensor: ";
        str += " (id: " + id + ")";
        str += " (macAddress: " + macAddress + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
