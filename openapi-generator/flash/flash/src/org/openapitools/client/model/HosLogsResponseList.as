package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HosLogsResponseLogs;

    public class HosLogsResponseList implements ListWrapper {
        // This declaration below of _HosLogsResponse_obj_class is to force flash compiler to include this class
        private var _hosLogsResponse_obj_class: org.openapitools.client.model.HosLogsResponse = null;
        [XmlElements(name="hosLogsResponse", type="org.openapitools.client.model.HosLogsResponse")]
        public var hosLogsResponse: Array = new Array();

        public function getList(): Array{
            return hosLogsResponse;
        }

}

}
