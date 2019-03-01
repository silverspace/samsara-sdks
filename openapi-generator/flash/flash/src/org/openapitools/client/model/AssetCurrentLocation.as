package org.openapitools.client.model {


    [XmlRootNode(name="AssetCurrentLocation")]
    public class AssetCurrentLocation {
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
        [XmlElement(name="timeMs")]
        public var timeMs: Number = 0;

    public function toString(): String {
        var str: String = "AssetCurrentLocation: ";
        str += " (latitude: " + latitude + ")";
        str += " (location: " + location + ")";
        str += " (longitude: " + longitude + ")";
        str += " (speedMilesPerHour: " + speedMilesPerHour + ")";
        str += " (timeMs: " + timeMs + ")";
        return str;
    }

}

}
