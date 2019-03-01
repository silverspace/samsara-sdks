package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DataInputHistoryResponsePoints;

    public class DataInputHistoryResponseList implements ListWrapper {
        // This declaration below of _DataInputHistoryResponse_obj_class is to force flash compiler to include this class
        private var _dataInputHistoryResponse_obj_class: org.openapitools.client.model.DataInputHistoryResponse = null;
        [XmlElements(name="dataInputHistoryResponse", type="org.openapitools.client.model.DataInputHistoryResponse")]
        public var dataInputHistoryResponse: Array = new Array();

        public function getList(): Array{
            return dataInputHistoryResponse;
        }

}

}
