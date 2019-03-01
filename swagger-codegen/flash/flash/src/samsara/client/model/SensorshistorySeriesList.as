package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class SensorshistorySeriesList implements ListWrapper {
        // This declaration below of _sensorshistory_series_obj_class is to force flash compiler to include this class
        private var _sensorshistorySeries_obj_class: samsara.client.model.SensorshistorySeries = null;
        [XmlElements(name="sensorshistorySeries", type="samsara.client.model.SensorshistorySeries")]
        public var sensorshistorySeries: Array = new Array();

        public function getList(): Array{
            return sensorshistorySeries;
        }

}

}
