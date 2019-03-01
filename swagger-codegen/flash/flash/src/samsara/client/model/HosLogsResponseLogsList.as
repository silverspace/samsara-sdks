package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class HosLogsResponseLogsList implements ListWrapper {
        // This declaration below of _HosLogsResponse_logs_obj_class is to force flash compiler to include this class
        private var _hosLogsResponseLogs_obj_class: samsara.client.model.HosLogsResponseLogs = null;
        [XmlElements(name="hosLogsResponseLogs", type="samsara.client.model.HosLogsResponseLogs")]
        public var hosLogsResponseLogs: Array = new Array();

        public function getList(): Array{
            return hosLogsResponseLogs;
        }

}

}
