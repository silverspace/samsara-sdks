package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class SensorList implements ListWrapper {
        // This declaration below of _Sensor_obj_class is to force flash compiler to include this class
        private var _sensor_obj_class: org.openapitools.client.model.Sensor = null;
        [XmlElements(name="sensor", type="org.openapitools.client.model.Sensor")]
        public var sensor: Array = new Array();

        public function getList(): Array{
            return sensor;
        }

}

}
