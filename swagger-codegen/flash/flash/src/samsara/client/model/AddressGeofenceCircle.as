package samsara.client.model {


    [XmlRootNode(name="AddressGeofenceCircle")]
    public class AddressGeofenceCircle {
        /* The latitude of the center of the circular geofence */
        [XmlElement(name="latitude")]
        public var latitude: Number = 0.0;
        /* The longitude of the center of the circular geofence */
        [XmlElement(name="longitude")]
        public var longitude: Number = 0.0;
        /* The radius of the circular geofence */
        [XmlElement(name="radiusMeters")]
        public var radiusMeters: Number = 0;

    public function toString(): String {
        var str: String = "AddressGeofenceCircle: ";
        str += " (latitude: " + latitude + ")";
        str += " (longitude: " + longitude + ")";
        str += " (radiusMeters: " + radiusMeters + ")";
        return str;
    }

}

}
