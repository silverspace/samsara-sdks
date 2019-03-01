package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class HosLogsParam2List implements ListWrapper {
        // This declaration below of _hosLogsParam_2_obj_class is to force flash compiler to include this class
        private var _hosLogsParam2_obj_class: samsara.client.model.HosLogsParam2 = null;
        [XmlElements(name="hosLogsParam2", type="samsara.client.model.HosLogsParam2")]
        public var hosLogsParam2: Array = new Array();

        public function getList(): Array{
            return hosLogsParam2;
        }

}

}
