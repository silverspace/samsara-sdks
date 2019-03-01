package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.VehicleMaintenanceJ1939;
import samsara.client.model.VehicleMaintenancePassenger;

    public class VehicleMaintenanceList implements ListWrapper {
        // This declaration below of _VehicleMaintenance_obj_class is to force flash compiler to include this class
        private var _vehicleMaintenance_obj_class: samsara.client.model.VehicleMaintenance = null;
        [XmlElements(name="vehicleMaintenance", type="samsara.client.model.VehicleMaintenance")]
        public var vehicleMaintenance: Array = new Array();

        public function getList(): Array{
            return vehicleMaintenance;
        }

}

}
