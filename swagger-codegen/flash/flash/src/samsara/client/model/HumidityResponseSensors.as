package samsara.client.model {


    [XmlRootNode(name="HumidityResponseSensors")]
    public class HumidityResponseSensors {
        /* Currently reported relative humidity in percent, from 0-100. */
        [XmlElement(name="humidity")]
        public var humidity: Number = NaN;
        /* ID of the sensor. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the sensor. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "HumidityResponseSensors: ";
        str += " (humidity: " + humidity + ")";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
