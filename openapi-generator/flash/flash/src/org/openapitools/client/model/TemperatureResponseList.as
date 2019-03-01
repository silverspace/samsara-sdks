package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TemperatureResponseSensors;

    public class TemperatureResponseList implements ListWrapper {
        // This declaration below of _TemperatureResponse_obj_class is to force flash compiler to include this class
        private var _temperatureResponse_obj_class: org.openapitools.client.model.TemperatureResponse = null;
        [XmlElements(name="temperatureResponse", type="org.openapitools.client.model.TemperatureResponse")]
        public var temperatureResponse: Array = new Array();

        public function getList(): Array{
            return temperatureResponse;
        }

}

}
