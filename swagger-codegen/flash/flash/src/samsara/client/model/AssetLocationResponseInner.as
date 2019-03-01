package samsara.client.model {


    [XmlRootNode(name="AssetLocationResponseInner")]
    public class AssetLocationResponseInner {
        /* The latitude of the location in degrees. */
        [XmlElement(name="latitude")]
        public var latitude: Number = 0.0;
        /* The best effort (street,city,state) for the latitude and longitude. */
        [XmlElement(name="location")]
        public var location: String = null;
        /* The longitude of the location in degrees. */
        [XmlElement(name="longitude")]
        public var longitude: Number = 0.0;
        /* The speed calculated from GPS that the asset was traveling at in miles per hour. */
        [XmlElement(name="speedMilesPerHour")]
        public var speedMilesPerHour: Number = 0.0;
        /* Time in Unix milliseconds since epoch when the asset was at the location. */
        [XmlElement(name="time")]
        public var time: Number = NaN;

    public function toString(): String {
        var str: String = "AssetLocationResponseInner: ";
        str += " (latitude: " + latitude + ")";
        str += " (location: " + location + ")";
        str += " (longitude: " + longitude + ")";
        str += " (speedMilesPerHour: " + speedMilesPerHour + ")";
        str += " (time: " + time + ")";
        return str;
    }

}

}
