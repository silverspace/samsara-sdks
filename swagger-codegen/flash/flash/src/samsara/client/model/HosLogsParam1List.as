package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class HosLogsParam1List implements ListWrapper {
        // This declaration below of _hosLogsParam_1_obj_class is to force flash compiler to include this class
        private var _hosLogsParam1_obj_class: samsara.client.model.HosLogsParam1 = null;
        [XmlElements(name="hosLogsParam1", type="samsara.client.model.HosLogsParam1")]
        public var hosLogsParam1: Array = new Array();

        public function getList(): Array{
            return hosLogsParam1;
        }

}

}
