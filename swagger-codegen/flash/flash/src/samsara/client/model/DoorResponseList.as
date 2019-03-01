package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DoorResponseSensors;

    public class DoorResponseList implements ListWrapper {
        // This declaration below of _DoorResponse_obj_class is to force flash compiler to include this class
        private var _doorResponse_obj_class: samsara.client.model.DoorResponse = null;
        [XmlElements(name="doorResponse", type="samsara.client.model.DoorResponse")]
        public var doorResponse: Array = new Array();

        public function getList(): Array{
            return doorResponse;
        }

}

}
