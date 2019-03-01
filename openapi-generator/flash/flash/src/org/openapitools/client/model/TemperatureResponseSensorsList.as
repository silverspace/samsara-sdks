package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TemperatureResponseSensorsList implements ListWrapper {
        // This declaration below of _TemperatureResponse_sensors_obj_class is to force flash compiler to include this class
        private var _temperatureResponseSensors_obj_class: org.openapitools.client.model.TemperatureResponseSensors = null;
        [XmlElements(name="temperatureResponseSensors", type="org.openapitools.client.model.TemperatureResponseSensors")]
        public var temperatureResponseSensors: Array = new Array();

        public function getList(): Array{
            return temperatureResponseSensors;
        }

}

}
