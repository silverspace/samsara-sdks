package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Driver;

    public class DriversResponseList implements ListWrapper {
        // This declaration below of _DriversResponse_obj_class is to force flash compiler to include this class
        private var _driversResponse_obj_class: org.openapitools.client.model.DriversResponse = null;
        [XmlElements(name="driversResponse", type="org.openapitools.client.model.DriversResponse")]
        public var driversResponse: Array = new Array();

        public function getList(): Array{
            return driversResponse;
        }

}

}
