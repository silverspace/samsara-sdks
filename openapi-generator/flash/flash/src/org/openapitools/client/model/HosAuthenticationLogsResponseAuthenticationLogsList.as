package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class HosAuthenticationLogsResponseAuthenticationLogsList implements ListWrapper {
        // This declaration below of _HosAuthenticationLogsResponse_authenticationLogs_obj_class is to force flash compiler to include this class
        private var _hosAuthenticationLogsResponseAuthenticationLogs_obj_class: org.openapitools.client.model.HosAuthenticationLogsResponseAuthenticationLogs = null;
        [XmlElements(name="hosAuthenticationLogsResponseAuthenticationLogs", type="org.openapitools.client.model.HosAuthenticationLogsResponseAuthenticationLogs")]
        public var hosAuthenticationLogsResponseAuthenticationLogs: Array = new Array();

        public function getList(): Array{
            return hosAuthenticationLogsResponseAuthenticationLogs;
        }

}

}
