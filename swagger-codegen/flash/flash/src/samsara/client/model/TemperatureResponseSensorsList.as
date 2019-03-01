package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class TemperatureResponseSensorsList implements ListWrapper {
        // This declaration below of _TemperatureResponse_sensors_obj_class is to force flash compiler to include this class
        private var _temperatureResponseSensors_obj_class: samsara.client.model.TemperatureResponseSensors = null;
        [XmlElements(name="temperatureResponseSensors", type="samsara.client.model.TemperatureResponseSensors")]
        public var temperatureResponseSensors: Array = new Array();

        public function getList(): Array{
            return temperatureResponseSensors;
        }

}

}
