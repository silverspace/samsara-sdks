package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.SensorHistoryResponseResults;

    public class SensorHistoryResponseList implements ListWrapper {
        // This declaration below of _SensorHistoryResponse_obj_class is to force flash compiler to include this class
        private var _sensorHistoryResponse_obj_class: samsara.client.model.SensorHistoryResponse = null;
        [XmlElements(name="sensorHistoryResponse", type="samsara.client.model.SensorHistoryResponse")]
        public var sensorHistoryResponse: Array = new Array();

        public function getList(): Array{
            return sensorHistoryResponse;
        }

}

}
