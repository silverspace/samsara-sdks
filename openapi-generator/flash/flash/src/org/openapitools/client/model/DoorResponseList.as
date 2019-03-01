package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DoorResponseSensors;

    public class DoorResponseList implements ListWrapper {
        // This declaration below of _DoorResponse_obj_class is to force flash compiler to include this class
        private var _doorResponse_obj_class: org.openapitools.client.model.DoorResponse = null;
        [XmlElements(name="doorResponse", type="org.openapitools.client.model.DoorResponse")]
        public var doorResponse: Array = new Array();

        public function getList(): Array{
            return doorResponse;
        }

}

}
