package samsara.client.model {

import samsara.client.model.DriversSummaryResponseSummaries;

    [XmlRootNode(name="DriversSummaryResponse")]
    public class DriversSummaryResponse {
                // This declaration below of _summaries_obj_class is to force flash compiler to include this class
        private var _summaries_obj_class: Array = null;
        [XmlElementWrapper(name="Summaries")]
        [XmlElements(name="summaries", type="Array")]
                public var summaries: Array = new Array();

    public function toString(): String {
        var str: String = "DriversSummaryResponse: ";
        str += " (summaries: " + summaries + ")";
        return str;
    }

}

}
