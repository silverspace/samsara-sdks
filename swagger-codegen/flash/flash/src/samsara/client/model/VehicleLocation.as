package samsara.client.model {


    [XmlRootNode(name="VehicleLocation")]
    public class VehicleLocation {
        /* Heading in degrees. */
        [XmlElement(name="heading")]
        public var heading: Number = 0.0;
        /* ID of the vehicle. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Latitude in decimal degrees. */
        [XmlElement(name="latitude")]
        public var latitude: Number = 0.0;
        /* Text representation of nearest identifiable location to (latitude, longitude) coordinates. */
        [XmlElement(name="location")]
        public var location: String = null;
        /* Longitude in decimal degrees. */
        [XmlElement(name="longitude")]
        public var longitude: Number = 0.0;
        /* Name of the vehicle. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* The number of meters reported by the odometer. */
        [XmlElement(name="odometerMeters")]
        public var odometerMeters: Number = 0;
        /* Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. */
        [XmlElement(name="onTrip")]
        public var onTrip: Boolean = false;
        /* Speed in miles per hour. */
        [XmlElement(name="speed")]
        public var speed: Number = 0.0;
        /* The time the reported location was logged, reported as a UNIX timestamp in milliseconds. */
        [XmlElement(name="time")]
        public var time: Number = NaN;
        /* Vehicle Identification Number (VIN) of the vehicle. */
        [XmlElement(name="vin")]
        public var vin: String = null;

    public function toString(): String {
        var str: String = "VehicleLocation: ";
        str += " (heading: " + heading + ")";
        str += " (id: " + id + ")";
        str += " (latitude: " + latitude + ")";
        str += " (location: " + location + ")";
        str += " (longitude: " + longitude + ")";
        str += " (name: " + name + ")";
        str += " (odometerMeters: " + odometerMeters + ")";
        str += " (onTrip: " + onTrip + ")";
        str += " (speed: " + speed + ")";
        str += " (time: " + time + ")";
        str += " (vin: " + vin + ")";
        return str;
    }

}

}
