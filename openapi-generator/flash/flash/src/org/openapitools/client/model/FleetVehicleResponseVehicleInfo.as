package org.openapitools.client.model {


    [XmlRootNode(name="FleetVehicleResponseVehicleInfo")]
    public class FleetVehicleResponseVehicleInfo {
        /* Year of the vehicle. */
        [XmlElement(name="year")]
        public var year: Number = 0;
        /* Model of the Vehicle. */
        [XmlElement(name="model")]
        public var model: String = null;
        /* Vehicle Identification Number. */
        [XmlElement(name="vin")]
        public var vin: String = null;
        /* Make of the vehicle. */
        [XmlElement(name="make")]
        public var make: String = null;

    public function toString(): String {
        var str: String = "FleetVehicleResponseVehicleInfo: ";
        str += " (year: " + year + ")";
        str += " (model: " + model + ")";
        str += " (vin: " + vin + ")";
        str += " (make: " + make + ")";
        return str;
    }

}

}
