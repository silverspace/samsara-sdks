package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DriverBase;
import org.openapitools.client.model.TagMetadata;

    public class DriverList implements ListWrapper {
        // This declaration below of _Driver_obj_class is to force flash compiler to include this class
        private var _driver_obj_class: org.openapitools.client.model.Driver = null;
        [XmlElements(name="driver", type="org.openapitools.client.model.Driver")]
        public var driver: Array = new Array();

        public function getList(): Array{
            return driver;
        }

}

}
