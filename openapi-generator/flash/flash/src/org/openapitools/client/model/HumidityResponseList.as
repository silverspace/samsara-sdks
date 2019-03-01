package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HumidityResponseSensors;

    public class HumidityResponseList implements ListWrapper {
        // This declaration below of _HumidityResponse_obj_class is to force flash compiler to include this class
        private var _humidityResponse_obj_class: org.openapitools.client.model.HumidityResponse = null;
        [XmlElements(name="humidityResponse", type="org.openapitools.client.model.HumidityResponse")]
        public var humidityResponse: Array = new Array();

        public function getList(): Array{
            return humidityResponse;
        }

}

}
