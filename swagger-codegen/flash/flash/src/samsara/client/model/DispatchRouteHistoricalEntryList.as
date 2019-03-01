package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DispatchRoute;

    public class DispatchRouteHistoricalEntryList implements ListWrapper {
        // This declaration below of _DispatchRouteHistoricalEntry_obj_class is to force flash compiler to include this class
        private var _dispatchRouteHistoricalEntry_obj_class: samsara.client.model.DispatchRouteHistoricalEntry = null;
        [XmlElements(name="dispatchRouteHistoricalEntry", type="samsara.client.model.DispatchRouteHistoricalEntry")]
        public var dispatchRouteHistoricalEntry: Array = new Array();

        public function getList(): Array{
            return dispatchRouteHistoricalEntry;
        }

}

}
