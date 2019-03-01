package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DriverBase;

    public class DriverForCreateList implements ListWrapper {
        // This declaration below of _DriverForCreate_obj_class is to force flash compiler to include this class
        private var _driverForCreate_obj_class: org.openapitools.client.model.DriverForCreate = null;
        [XmlElements(name="driverForCreate", type="org.openapitools.client.model.DriverForCreate")]
        public var driverForCreate: Array = new Array();

        public function getList(): Array{
            return driverForCreate;
        }

}

}
