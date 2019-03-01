package org.openapitools.client.model {


    [XmlRootNode(name="CargoResponseSensors")]
    public class CargoResponseSensors {
        /* Flag indicating whether the current cargo is empty or loaded. */
        [XmlElement(name="cargoEmpty")]
        public var cargoEmpty: Boolean = false;
        /* Name of the sensor. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* ID of the sensor. */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "CargoResponseSensors: ";
        str += " (cargoEmpty: " + cargoEmpty + ")";
        str += " (name: " + name + ")";
        str += " (id: " + id + ")";
        return str;
    }

}

}
