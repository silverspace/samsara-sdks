package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class SensorList implements ListWrapper {
        // This declaration below of _Sensor_obj_class is to force flash compiler to include this class
        private var _sensor_obj_class: samsara.client.model.Sensor = null;
        [XmlElements(name="sensor", type="samsara.client.model.Sensor")]
        public var sensor: Array = new Array();

        public function getList(): Array{
            return sensor;
        }

}

}
