package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DataInputHistoryResponsePointsList implements ListWrapper {
        // This declaration below of _DataInputHistoryResponse_points_obj_class is to force flash compiler to include this class
        private var _dataInputHistoryResponsePoints_obj_class: samsara.client.model.DataInputHistoryResponsePoints = null;
        [XmlElements(name="dataInputHistoryResponsePoints", type="samsara.client.model.DataInputHistoryResponsePoints")]
        public var dataInputHistoryResponsePoints: Array = new Array();

        public function getList(): Array{
            return dataInputHistoryResponsePoints;
        }

}

}
