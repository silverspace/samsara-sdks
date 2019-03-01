package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DispatchRouteHistoricalEntry;

    public class DispatchRouteHistoryList implements ListWrapper {
        // This declaration below of _DispatchRouteHistory_obj_class is to force flash compiler to include this class
        private var _dispatchRouteHistory_obj_class: org.openapitools.client.model.DispatchRouteHistory = null;
        [XmlElements(name="dispatchRouteHistory", type="org.openapitools.client.model.DispatchRouteHistory")]
        public var dispatchRouteHistory: Array = new Array();

        public function getList(): Array{
            return dispatchRouteHistory;
        }

}

}
