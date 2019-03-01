package org.openapitools.client.model {


    [XmlRootNode(name="TemperatureResponseSensors")]
    public class TemperatureResponseSensors {
        /* Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported. */
        [XmlElement(name="probeTemperature")]
        public var probeTemperature: Number = 0;
        /* Name of the sensor. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* ID of the sensor. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Currently reported ambient temperature in millidegrees celsius. */
        [XmlElement(name="ambientTemperature")]
        public var ambientTemperature: Number = 0;

    public function toString(): String {
        var str: String = "TemperatureResponseSensors: ";
        str += " (probeTemperature: " + probeTemperature + ")";
        str += " (name: " + name + ")";
        str += " (id: " + id + ")";
        str += " (ambientTemperature: " + ambientTemperature + ")";
        return str;
    }

}

}
