package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class SensorHistoryResponseResultsList implements ListWrapper {
        // This declaration below of _SensorHistoryResponse_results_obj_class is to force flash compiler to include this class
        private var _sensorHistoryResponseResults_obj_class: samsara.client.model.SensorHistoryResponseResults = null;
        [XmlElements(name="sensorHistoryResponseResults", type="samsara.client.model.SensorHistoryResponseResults")]
        public var sensorHistoryResponseResults: Array = new Array();

        public function getList(): Array{
            return sensorHistoryResponseResults;
        }

}

}
