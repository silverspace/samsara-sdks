package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DoorResponseSensorsList implements ListWrapper {
        // This declaration below of _DoorResponse_sensors_obj_class is to force flash compiler to include this class
        private var _doorResponseSensors_obj_class: org.openapitools.client.model.DoorResponseSensors = null;
        [XmlElements(name="doorResponseSensors", type="org.openapitools.client.model.DoorResponseSensors")]
        public var doorResponseSensors: Array = new Array();

        public function getList(): Array{
            return doorResponseSensors;
        }

}

}
