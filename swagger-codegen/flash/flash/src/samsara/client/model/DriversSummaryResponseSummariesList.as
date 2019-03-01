package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DriversSummaryResponseSummariesList implements ListWrapper {
        // This declaration below of _DriversSummaryResponse_Summaries_obj_class is to force flash compiler to include this class
        private var _driversSummaryResponseSummaries_obj_class: samsara.client.model.DriversSummaryResponseSummaries = null;
        [XmlElements(name="driversSummaryResponseSummaries", type="samsara.client.model.DriversSummaryResponseSummaries")]
        public var driversSummaryResponseSummaries: Array = new Array();

        public function getList(): Array{
            return driversSummaryResponseSummaries;
        }

}

}
