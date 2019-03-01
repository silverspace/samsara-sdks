package org.openapitools.client.model {


    [XmlRootNode(name="VehicleMaintenancePassengerCheckEngineLight")]
    public class VehicleMaintenancePassengerCheckEngineLight {
                [XmlElement(name="isOn")]
        public var isOn: Boolean = false;

    public function toString(): String {
        var str: String = "VehicleMaintenancePassengerCheckEngineLight: ";
        str += " (isOn: " + isOn + ")";
        return str;
    }

}

}
