package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class HosLogsResponseLogsList implements ListWrapper {
        // This declaration below of _HosLogsResponse_logs_obj_class is to force flash compiler to include this class
        private var _hosLogsResponseLogs_obj_class: org.openapitools.client.model.HosLogsResponseLogs = null;
        [XmlElements(name="hosLogsResponseLogs", type="org.openapitools.client.model.HosLogsResponseLogs")]
        public var hosLogsResponseLogs: Array = new Array();

        public function getList(): Array{
            return hosLogsResponseLogs;
        }

}

}
