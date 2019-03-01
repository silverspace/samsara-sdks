package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DriversSummaryResponseSummaries;

    public class DriversSummaryResponseList implements ListWrapper {
        // This declaration below of _DriversSummaryResponse_obj_class is to force flash compiler to include this class
        private var _driversSummaryResponse_obj_class: org.openapitools.client.model.DriversSummaryResponse = null;
        [XmlElements(name="driversSummaryResponse", type="org.openapitools.client.model.DriversSummaryResponse")]
        public var driversSummaryResponse: Array = new Array();

        public function getList(): Array{
            return driversSummaryResponse;
        }

}

}
