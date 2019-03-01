package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class SensorsHistorySeriesList implements ListWrapper {
        // This declaration below of __sensors_history_series_obj_class is to force flash compiler to include this class
        private var _sensorsHistorySeries_obj_class: org.openapitools.client.model.SensorsHistorySeries = null;
        [XmlElements(name="sensorsHistorySeries", type="org.openapitools.client.model.SensorsHistorySeries")]
        public var sensorsHistorySeries: Array = new Array();

        public function getList(): Array{
            return sensorsHistorySeries;
        }

}

}
