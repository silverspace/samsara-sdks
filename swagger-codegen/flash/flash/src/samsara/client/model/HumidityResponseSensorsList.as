package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class HumidityResponseSensorsList implements ListWrapper {
        // This declaration below of _HumidityResponse_sensors_obj_class is to force flash compiler to include this class
        private var _humidityResponseSensors_obj_class: samsara.client.model.HumidityResponseSensors = null;
        [XmlElements(name="humidityResponseSensors", type="samsara.client.model.HumidityResponseSensors")]
        public var humidityResponseSensors: Array = new Array();

        public function getList(): Array{
            return humidityResponseSensors;
        }

}

}
