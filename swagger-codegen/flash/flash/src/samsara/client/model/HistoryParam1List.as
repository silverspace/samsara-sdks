package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.SensorshistorySeries;

    public class HistoryParam1List implements ListWrapper {
        // This declaration below of _historyParam_1_obj_class is to force flash compiler to include this class
        private var _historyParam1_obj_class: samsara.client.model.HistoryParam1 = null;
        [XmlElements(name="historyParam1", type="samsara.client.model.HistoryParam1")]
        public var historyParam1: Array = new Array();

        public function getList(): Array{
            return historyParam1;
        }

}

}
