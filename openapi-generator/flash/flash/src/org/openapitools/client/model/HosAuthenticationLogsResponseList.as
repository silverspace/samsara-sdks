package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HosAuthenticationLogsResponseAuthenticationLogs;

    public class HosAuthenticationLogsResponseList implements ListWrapper {
        // This declaration below of _HosAuthenticationLogsResponse_obj_class is to force flash compiler to include this class
        private var _hosAuthenticationLogsResponse_obj_class: org.openapitools.client.model.HosAuthenticationLogsResponse = null;
        [XmlElements(name="hosAuthenticationLogsResponse", type="org.openapitools.client.model.HosAuthenticationLogsResponse")]
        public var hosAuthenticationLogsResponse: Array = new Array();

        public function getList(): Array{
            return hosAuthenticationLogsResponse;
        }

}

}
