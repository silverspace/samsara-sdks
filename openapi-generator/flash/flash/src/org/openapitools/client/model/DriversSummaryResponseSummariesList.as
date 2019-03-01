package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DriversSummaryResponseSummariesList implements ListWrapper {
        // This declaration below of _DriversSummaryResponse_Summaries_obj_class is to force flash compiler to include this class
        private var _driversSummaryResponseSummaries_obj_class: org.openapitools.client.model.DriversSummaryResponseSummaries = null;
        [XmlElements(name="driversSummaryResponseSummaries", type="org.openapitools.client.model.DriversSummaryResponseSummaries")]
        public var driversSummaryResponseSummaries: Array = new Array();

        public function getList(): Array{
            return driversSummaryResponseSummaries;
        }

}

}
