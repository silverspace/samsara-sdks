package org.openapitools.client.model {


    [XmlRootNode(name="VehicleMaintenanceJ1939CheckEngineLight")]
    public class VehicleMaintenanceJ1939CheckEngineLight {
                [XmlElement(name="protectIsOn")]
        public var protectIsOn: Boolean = false;
                [XmlElement(name="stopIsOn")]
        public var stopIsOn: Boolean = false;
                [XmlElement(name="warningIsOn")]
        public var warningIsOn: Boolean = false;
                [XmlElement(name="emissionsIsOn")]
        public var emissionsIsOn: Boolean = false;

    public function toString(): String {
        var str: String = "VehicleMaintenanceJ1939CheckEngineLight: ";
        str += " (protectIsOn: " + protectIsOn + ")";
        str += " (stopIsOn: " + stopIsOn + ")";
        str += " (warningIsOn: " + warningIsOn + ")";
        str += " (emissionsIsOn: " + emissionsIsOn + ")";
        return str;
    }

}

}
