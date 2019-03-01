package org.openapitools.client.model {


    [XmlRootNode(name="DvirBaseVehicle")]
    public class DvirBaseVehicle {
        /* The vehicle on which DVIR was done. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* The vehicle id on which DVIR was done. */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "DvirBaseVehicle: ";
        str += " (name: " + name + ")";
        str += " (id: " + id + ")";
        return str;
    }

}

}
