package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DispatchRoute;

    public class DispatchRouteHistoricalEntryList implements ListWrapper {
        // This declaration below of _DispatchRouteHistoricalEntry_obj_class is to force flash compiler to include this class
        private var _dispatchRouteHistoricalEntry_obj_class: org.openapitools.client.model.DispatchRouteHistoricalEntry = null;
        [XmlElements(name="dispatchRouteHistoricalEntry", type="org.openapitools.client.model.DispatchRouteHistoricalEntry")]
        public var dispatchRouteHistoricalEntry: Array = new Array();

        public function getList(): Array{
            return dispatchRouteHistoricalEntry;
        }

}

}
