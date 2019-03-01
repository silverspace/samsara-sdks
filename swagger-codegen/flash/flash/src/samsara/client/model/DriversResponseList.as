package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.Driver;

    public class DriversResponseList implements ListWrapper {
        // This declaration below of _DriversResponse_obj_class is to force flash compiler to include this class
        private var _driversResponse_obj_class: samsara.client.model.DriversResponse = null;
        [XmlElements(name="driversResponse", type="samsara.client.model.DriversResponse")]
        public var driversResponse: Array = new Array();

        public function getList(): Array{
            return driversResponse;
        }

}

}
