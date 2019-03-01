package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class HosAuthenticationLogsResponseAuthenticationLogsList implements ListWrapper {
        // This declaration below of _HosAuthenticationLogsResponse_authenticationLogs_obj_class is to force flash compiler to include this class
        private var _hosAuthenticationLogsResponseAuthenticationLogs_obj_class: samsara.client.model.HosAuthenticationLogsResponseAuthenticationLogs = null;
        [XmlElements(name="hosAuthenticationLogsResponseAuthenticationLogs", type="samsara.client.model.HosAuthenticationLogsResponseAuthenticationLogs")]
        public var hosAuthenticationLogsResponseAuthenticationLogs: Array = new Array();

        public function getList(): Array{
            return hosAuthenticationLogsResponseAuthenticationLogs;
        }

}

}
