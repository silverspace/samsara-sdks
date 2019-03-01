package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class HistoryParamList implements ListWrapper {
        // This declaration below of _historyParam_obj_class is to force flash compiler to include this class
        private var _historyParam_obj_class: samsara.client.model.HistoryParam = null;
        [XmlElements(name="historyParam", type="samsara.client.model.HistoryParam")]
        public var historyParam: Array = new Array();

        public function getList(): Array{
            return historyParam;
        }

}

}
