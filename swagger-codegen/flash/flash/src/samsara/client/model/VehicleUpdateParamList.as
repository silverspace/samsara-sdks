package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.Vehicle;

    public class VehicleUpdateParamList implements ListWrapper {
        // This declaration below of _vehicleUpdateParam_obj_class is to force flash compiler to include this class
        private var _vehicleUpdateParam_obj_class: samsara.client.model.VehicleUpdateParam = null;
        [XmlElements(name="vehicleUpdateParam", type="samsara.client.model.VehicleUpdateParam")]
        public var vehicleUpdateParam: Array = new Array();

        public function getList(): Array{
            return vehicleUpdateParam;
        }

}

}
