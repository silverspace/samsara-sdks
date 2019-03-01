package samsara.client.model {

import samsara.client.model.HosLogsResponseLogs;

    [XmlRootNode(name="HosLogsResponse")]
    public class HosLogsResponse {
                // This declaration below of _logs_obj_class is to force flash compiler to include this class
        private var _logs_obj_class: Array = null;
        [XmlElementWrapper(name="logs")]
        [XmlElements(name="logs", type="Array")]
                public var logs: Array = new Array();

    public function toString(): String {
        var str: String = "HosLogsResponse: ";
        str += " (logs: " + logs + ")";
        return str;
    }

}

}
