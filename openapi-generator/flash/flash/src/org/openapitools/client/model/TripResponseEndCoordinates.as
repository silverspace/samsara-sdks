package org.openapitools.client.model {


    [XmlRootNode(name="TripResponseEndCoordinates")]
    public class TripResponseEndCoordinates {
                [XmlElement(name="latitude")]
        public var latitude: Number = 0.0;
                [XmlElement(name="longitude")]
        public var longitude: Number = 0.0;

    public function toString(): String {
        var str: String = "TripResponseEndCoordinates: ";
        str += " (latitude: " + latitude + ")";
        str += " (longitude: " + longitude + ")";
        return str;
    }

}

}
