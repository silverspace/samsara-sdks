package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DriverBase;
import samsara.client.model.TagIds;

    public class DriverForCreateList implements ListWrapper {
        // This declaration below of _DriverForCreate_obj_class is to force flash compiler to include this class
        private var _driverForCreate_obj_class: samsara.client.model.DriverForCreate = null;
        [XmlElements(name="driverForCreate", type="samsara.client.model.DriverForCreate")]
        public var driverForCreate: Array = new Array();

        public function getList(): Array{
            return driverForCreate;
        }

}

}
