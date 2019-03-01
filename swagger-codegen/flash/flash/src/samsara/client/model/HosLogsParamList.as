package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class HosLogsParamList implements ListWrapper {
        // This declaration below of _hosLogsParam_obj_class is to force flash compiler to include this class
        private var _hosLogsParam_obj_class: samsara.client.model.HosLogsParam = null;
        [XmlElements(name="hosLogsParam", type="samsara.client.model.HosLogsParam")]
        public var hosLogsParam: Array = new Array();

        public function getList(): Array{
            return hosLogsParam;
        }

}

}
