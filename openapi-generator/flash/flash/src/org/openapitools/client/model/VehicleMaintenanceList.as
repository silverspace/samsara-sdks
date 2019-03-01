package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.VehicleMaintenanceJ1939;
import org.openapitools.client.model.VehicleMaintenancePassenger;

    public class VehicleMaintenanceList implements ListWrapper {
        // This declaration below of _VehicleMaintenance_obj_class is to force flash compiler to include this class
        private var _vehicleMaintenance_obj_class: org.openapitools.client.model.VehicleMaintenance = null;
        [XmlElements(name="vehicleMaintenance", type="org.openapitools.client.model.VehicleMaintenance")]
        public var vehicleMaintenance: Array = new Array();

        public function getList(): Array{
            return vehicleMaintenance;
        }

}

}
