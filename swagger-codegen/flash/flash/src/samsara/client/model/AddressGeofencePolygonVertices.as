package samsara.client.model {


    [XmlRootNode(name="AddressGeofencePolygonVertices")]
    public class AddressGeofencePolygonVertices {
        /* The longitude of a geofence vertex */
        [XmlElement(name="latitude")]
        public var latitude: Number = 0.0;
        /* The longitude of a geofence vertex */
        [XmlElement(name="longitude")]
        public var longitude: Number = 0.0;

    public function toString(): String {
        var str: String = "AddressGeofencePolygonVertices: ";
        str += " (latitude: " + latitude + ")";
        str += " (longitude: " + longitude + ")";
        return str;
    }

}

}
