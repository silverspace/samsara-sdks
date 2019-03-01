package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.HosAuthenticationLogsResponseAuthenticationLogs;

    public class HosAuthenticationLogsResponseList implements ListWrapper {
        // This declaration below of _HosAuthenticationLogsResponse_obj_class is to force flash compiler to include this class
        private var _hosAuthenticationLogsResponse_obj_class: samsara.client.model.HosAuthenticationLogsResponse = null;
        [XmlElements(name="hosAuthenticationLogsResponse", type="samsara.client.model.HosAuthenticationLogsResponse")]
        public var hosAuthenticationLogsResponse: Array = new Array();

        public function getList(): Array{
            return hosAuthenticationLogsResponse;
        }

}

}
