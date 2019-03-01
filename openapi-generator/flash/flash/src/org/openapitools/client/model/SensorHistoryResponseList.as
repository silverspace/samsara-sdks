package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.SensorHistoryResponseResults;

    public class SensorHistoryResponseList implements ListWrapper {
        // This declaration below of _SensorHistoryResponse_obj_class is to force flash compiler to include this class
        private var _sensorHistoryResponse_obj_class: org.openapitools.client.model.SensorHistoryResponse = null;
        [XmlElements(name="sensorHistoryResponse", type="org.openapitools.client.model.SensorHistoryResponse")]
        public var sensorHistoryResponse: Array = new Array();

        public function getList(): Array{
            return sensorHistoryResponse;
        }

}

}
