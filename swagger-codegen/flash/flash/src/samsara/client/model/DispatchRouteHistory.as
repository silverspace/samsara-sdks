package samsara.client.model {

import samsara.client.model.DispatchRouteHistoricalEntry;

    [XmlRootNode(name="DispatchRouteHistory")]
    public class DispatchRouteHistory {
        /* History of the route&#39;s state changes. */
        // This declaration below of _history_obj_class is to force flash compiler to include this class
        private var _history_obj_class: Array = null;
        [XmlElementWrapper(name="history")]
        [XmlElements(name="history", type="Array")]
                public var history: Array = new Array();

    public function toString(): String {
        var str: String = "DispatchRouteHistory: ";
        str += " (history: " + history + ")";
        return str;
    }

}

}
