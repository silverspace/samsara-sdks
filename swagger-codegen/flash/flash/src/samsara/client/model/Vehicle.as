package samsara.client.model {


    [XmlRootNode(name="Vehicle")]
    public class Vehicle {
        /* Total engine hours for the vehicle. */
        [XmlElement(name="engineHours")]
        public var engineHours: Number = 0;
        /* The fuel level of the vehicle as a percentage. (0.0 to 1.0) */
        [XmlElement(name="fuelLevelPercent")]
        public var fuelLevelPercent: Number = 0.0;
        /* ID of the vehicle. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the vehicle. */
        [XmlElement(name="name")]
        public var name: String = null;
                [XmlElement(name="note")]
        public var note: String = null;
        /* The number of meters reported by the odometer. */
        [XmlElement(name="odometerMeters")]
        public var odometerMeters: Number = 0;
        /* Vehicle Identification Number. */
        [XmlElement(name="vin")]
        public var vin: String = null;

    public function toString(): String {
        var str: String = "Vehicle: ";
        str += " (engineHours: " + engineHours + ")";
        str += " (fuelLevelPercent: " + fuelLevelPercent + ")";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (note: " + note + ")";
        str += " (odometerMeters: " + odometerMeters + ")";
        str += " (vin: " + vin + ")";
        return str;
    }

}

}
