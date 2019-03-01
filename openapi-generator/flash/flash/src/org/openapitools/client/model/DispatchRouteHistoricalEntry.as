package org.openapitools.client.model {

import org.openapitools.client.model.DispatchRoute;

    [XmlRootNode(name="DispatchRouteHistoricalEntry")]
    public class DispatchRouteHistoricalEntry {
        /* Timestamp that the route was updated, represented as Unix milliseconds since epoch. */
        [XmlElement(name="changed_at_ms")]
        public var changedAtMs: Number = 0;
                [XmlElement(name="route")]
        public var route: DispatchRoute = NaN;

    public function toString(): String {
        var str: String = "DispatchRouteHistoricalEntry: ";
        str += " (changedAtMs: " + changedAtMs + ")";
        str += " (route: " + route + ")";
        return str;
    }

}

}
