package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DriverBase;

    public class DriverList implements ListWrapper {
        // This declaration below of _Driver_obj_class is to force flash compiler to include this class
        private var _driver_obj_class: samsara.client.model.Driver = null;
        [XmlElements(name="driver", type="samsara.client.model.Driver")]
        public var driver: Array = new Array();

        public function getList(): Array{
            return driver;
        }

}

}
