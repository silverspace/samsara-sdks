package samsara.client.model {


    [XmlRootNode(name="CargoResponseSensors")]
    public class CargoResponseSensors {
        /* Flag indicating whether the current cargo is empty or loaded. */
        [XmlElement(name="cargoEmpty")]
        public var cargoEmpty: Boolean = false;
        /* ID of the sensor. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the sensor. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "CargoResponseSensors: ";
        str += " (cargoEmpty: " + cargoEmpty + ")";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
