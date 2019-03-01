package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class HosLogsSummaryResponseDriversList implements ListWrapper {
        // This declaration below of _HosLogsSummaryResponse_drivers_obj_class is to force flash compiler to include this class
        private var _hosLogsSummaryResponseDrivers_obj_class: org.openapitools.client.model.HosLogsSummaryResponseDrivers = null;
        [XmlElements(name="hosLogsSummaryResponseDrivers", type="org.openapitools.client.model.HosLogsSummaryResponseDrivers")]
        public var hosLogsSummaryResponseDrivers: Array = new Array();

        public function getList(): Array{
            return hosLogsSummaryResponseDrivers;
        }

}

}
