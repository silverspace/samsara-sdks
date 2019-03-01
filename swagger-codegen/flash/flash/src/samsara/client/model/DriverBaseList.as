package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DriverBaseList implements ListWrapper {
        // This declaration below of _DriverBase_obj_class is to force flash compiler to include this class
        private var _driverBase_obj_class: samsara.client.model.DriverBase = null;
        [XmlElements(name="driverBase", type="samsara.client.model.DriverBase")]
        public var driverBase: Array = new Array();

        public function getList(): Array{
            return driverBase;
        }

}

}
