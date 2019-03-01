package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DataInputHistoryResponsePoints;

    public class DataInputHistoryResponseList implements ListWrapper {
        // This declaration below of _DataInputHistoryResponse_obj_class is to force flash compiler to include this class
        private var _dataInputHistoryResponse_obj_class: samsara.client.model.DataInputHistoryResponse = null;
        [XmlElements(name="dataInputHistoryResponse", type="samsara.client.model.DataInputHistoryResponse")]
        public var dataInputHistoryResponse: Array = new Array();

        public function getList(): Array{
            return dataInputHistoryResponse;
        }

}

}
