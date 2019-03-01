package samsara.client.model {


    [XmlRootNode(name="TemperatureResponseSensors")]
    public class TemperatureResponseSensors {
        /* Currently reported ambient temperature in millidegrees celsius. */
        [XmlElement(name="ambientTemperature")]
        public var ambientTemperature: Number = NaN;
        /* ID of the sensor. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the sensor. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported. */
        [XmlElement(name="probeTemperature")]
        public var probeTemperature: Number = NaN;

    public function toString(): String {
        var str: String = "TemperatureResponseSensors: ";
        str += " (ambientTemperature: " + ambientTemperature + ")";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (probeTemperature: " + probeTemperature + ")";
        return str;
    }

}

}
