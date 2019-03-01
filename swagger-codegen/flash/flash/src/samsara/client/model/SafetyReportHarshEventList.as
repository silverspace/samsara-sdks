package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class SafetyReportHarshEventList implements ListWrapper {
        // This declaration below of _SafetyReportHarshEvent_obj_class is to force flash compiler to include this class
        private var _safetyReportHarshEvent_obj_class: samsara.client.model.SafetyReportHarshEvent = null;
        [XmlElements(name="safetyReportHarshEvent", type="samsara.client.model.SafetyReportHarshEvent")]
        public var safetyReportHarshEvent: Array = new Array();

        public function getList(): Array{
            return safetyReportHarshEvent;
        }

}

}
