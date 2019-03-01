package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.HosLogsSummaryResponseDrivers;

    public class HosLogsSummaryResponseList implements ListWrapper {
        // This declaration below of _HosLogsSummaryResponse_obj_class is to force flash compiler to include this class
        private var _hosLogsSummaryResponse_obj_class: samsara.client.model.HosLogsSummaryResponse = null;
        [XmlElements(name="hosLogsSummaryResponse", type="samsara.client.model.HosLogsSummaryResponse")]
        public var hosLogsSummaryResponse: Array = new Array();

        public function getList(): Array{
            return hosLogsSummaryResponse;
        }

}

}
