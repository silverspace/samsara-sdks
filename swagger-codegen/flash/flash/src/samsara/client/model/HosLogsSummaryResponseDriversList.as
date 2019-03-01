package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class HosLogsSummaryResponseDriversList implements ListWrapper {
        // This declaration below of _HosLogsSummaryResponse_drivers_obj_class is to force flash compiler to include this class
        private var _hosLogsSummaryResponseDrivers_obj_class: samsara.client.model.HosLogsSummaryResponseDrivers = null;
        [XmlElements(name="hosLogsSummaryResponseDrivers", type="samsara.client.model.HosLogsSummaryResponseDrivers")]
        public var hosLogsSummaryResponseDrivers: Array = new Array();

        public function getList(): Array{
            return hosLogsSummaryResponseDrivers;
        }

}

}
