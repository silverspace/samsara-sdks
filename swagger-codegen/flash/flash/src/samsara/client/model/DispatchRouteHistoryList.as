package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DispatchRouteHistoricalEntry;

    public class DispatchRouteHistoryList implements ListWrapper {
        // This declaration below of _DispatchRouteHistory_obj_class is to force flash compiler to include this class
        private var _dispatchRouteHistory_obj_class: samsara.client.model.DispatchRouteHistory = null;
        [XmlElements(name="dispatchRouteHistory", type="samsara.client.model.DispatchRouteHistory")]
        public var dispatchRouteHistory: Array = new Array();

        public function getList(): Array{
            return dispatchRouteHistory;
        }

}

}
