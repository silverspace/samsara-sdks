package org.openapitools.client.model {


    [XmlRootNode(name="TripResponseStartCoordinates")]
    public class TripResponseStartCoordinates {
                [XmlElement(name="latitude")]
        public var latitude: Number = 0.0;
                [XmlElement(name="longitude")]
        public var longitude: Number = 0.0;

    public function toString(): String {
        var str: String = "TripResponseStartCoordinates: ";
        str += " (latitude: " + latitude + ")";
        str += " (longitude: " + longitude + ")";
        return str;
    }

}

}
