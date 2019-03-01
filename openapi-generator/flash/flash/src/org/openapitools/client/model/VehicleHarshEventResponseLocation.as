package org.openapitools.client.model {


    [XmlRootNode(name="VehicleHarshEventResponseLocation")]
    public class VehicleHarshEventResponseLocation {
        /* Address of location where the harsh event occurred */
        [XmlElement(name="address")]
        public var address: String = null;
        /* Latitude of location where the harsh event occurred */
        [XmlElement(name="latitude")]
        public var latitude: String = null;
        /* Longitude of location where the harsh event occurred */
        [XmlElement(name="longitude")]
        public var longitude: String = null;

    public function toString(): String {
        var str: String = "VehicleHarshEventResponseLocation: ";
        str += " (address: " + address + ")";
        str += " (latitude: " + latitude + ")";
        str += " (longitude: " + longitude + ")";
        return str;
    }

}

}
