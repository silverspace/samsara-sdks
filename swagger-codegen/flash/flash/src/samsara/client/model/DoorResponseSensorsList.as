package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DoorResponseSensorsList implements ListWrapper {
        // This declaration below of _DoorResponse_sensors_obj_class is to force flash compiler to include this class
        private var _doorResponseSensors_obj_class: samsara.client.model.DoorResponseSensors = null;
        [XmlElements(name="doorResponseSensors", type="samsara.client.model.DoorResponseSensors")]
        public var doorResponseSensors: Array = new Array();

        public function getList(): Array{
            return doorResponseSensors;
        }

}

}
