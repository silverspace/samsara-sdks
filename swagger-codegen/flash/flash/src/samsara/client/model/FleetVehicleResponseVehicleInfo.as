package samsara.client.model {


    [XmlRootNode(name="FleetVehicleResponseVehicleInfo")]
    public class FleetVehicleResponseVehicleInfo {
        /* Make of the vehicle. */
        [XmlElement(name="make")]
        public var make: String = null;
        /* Model of the Vehicle. */
        [XmlElement(name="model")]
        public var model: String = null;
        /* Vehicle Identification Number. */
        [XmlElement(name="vin")]
        public var vin: String = null;
        /* Year of the vehicle. */
        [XmlElement(name="year")]
        public var year: Number = 0;

    public function toString(): String {
        var str: String = "FleetVehicleResponseVehicleInfo: ";
        str += " (make: " + make + ")";
        str += " (model: " + model + ")";
        str += " (vin: " + vin + ")";
        str += " (year: " + year + ")";
        return str;
    }

}

}
