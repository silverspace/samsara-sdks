package org.openapitools.client.model {

import org.openapitools.client.model.VehicleMaintenanceJ1939;
import org.openapitools.client.model.VehicleMaintenancePassenger;

    [XmlRootNode(name="VehicleMaintenance")]
    public class VehicleMaintenance {
        /* ID of the vehicle. */
        [XmlElement(name="id")]
        public var id: Number = 0;
                [XmlElement(name="j1939")]
        public var j1939: VehicleMaintenanceJ1939 = NaN;
                [XmlElement(name="passenger")]
        public var passenger: VehicleMaintenancePassenger = NaN;

    public function toString(): String {
        var str: String = "VehicleMaintenance: ";
        str += " (id: " + id + ")";
        str += " (j1939: " + j1939 + ")";
        str += " (passenger: " + passenger + ")";
        return str;
    }

}

}
