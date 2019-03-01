package org.openapitools.client.model {

import org.openapitools.client.model.FleetVehicleResponseVehicleInfo;

    [XmlRootNode(name="FleetVehicleResponse")]
    public class FleetVehicleResponse {
                // This declaration below of _externalIds_obj_class is to force flash compiler to include this class
        private var _externalIds_obj_class: Dictionary = null;
        [XmlElementWrapper(name="externalIds")]
        [XmlElements(name="externalIds", type="Dictionary")]
                public var externalIds: Dictionary = new Dictionary();
        /* Harsh event detection setting. */
        [XmlElement(name="harshAccelSetting")]
        public var harshAccelSetting: String = null;
        /* ID of the vehicle. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the vehicle. */
        [XmlElement(name="name")]
        public var name: String = null;
                [XmlElement(name="vehicleInfo")]
        public var vehicleInfo: FleetVehicleResponseVehicleInfo = NaN;

    public function toString(): String {
        var str: String = "FleetVehicleResponse: ";
        str += " (externalIds: " + externalIds + ")";
        str += " (harshAccelSetting: " + harshAccelSetting + ")";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (vehicleInfo: " + vehicleInfo + ")";
        return str;
    }

}

}
