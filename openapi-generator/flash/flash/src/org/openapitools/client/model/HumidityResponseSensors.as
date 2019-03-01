package org.openapitools.client.model {


    [XmlRootNode(name="HumidityResponseSensors")]
    public class HumidityResponseSensors {
        /* Name of the sensor. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Currently reported relative humidity in percent, from 0-100. */
        [XmlElement(name="humidity")]
        public var humidity: Number = 0;
        /* ID of the sensor. */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "HumidityResponseSensors: ";
        str += " (name: " + name + ")";
        str += " (humidity: " + humidity + ")";
        str += " (id: " + id + ")";
        return str;
    }

}

}
