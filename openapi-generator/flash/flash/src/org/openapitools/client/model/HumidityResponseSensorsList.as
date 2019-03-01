package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class HumidityResponseSensorsList implements ListWrapper {
        // This declaration below of _HumidityResponse_sensors_obj_class is to force flash compiler to include this class
        private var _humidityResponseSensors_obj_class: org.openapitools.client.model.HumidityResponseSensors = null;
        [XmlElements(name="humidityResponseSensors", type="org.openapitools.client.model.HumidityResponseSensors")]
        public var humidityResponseSensors: Array = new Array();

        public function getList(): Array{
            return humidityResponseSensors;
        }

}

}
