package org.openapitools.client.model {

import org.openapitools.client.model.InlineResponse2005VehicleStats;
import org.openapitools.client.model.Pagination;

    [XmlRootNode(name="InlineResponse2005")]
    public class InlineResponse2005 {
                [XmlElement(name="pagination")]
        public var pagination: Pagination = NaN;
                // This declaration below of _vehicleStats_obj_class is to force flash compiler to include this class
        private var _vehicleStats_obj_class: Array = null;
        [XmlElementWrapper(name="vehicleStats")]
        [XmlElements(name="vehicleStats", type="Array")]
                public var vehicleStats: Array = new Array();

    public function toString(): String {
        var str: String = "InlineResponse2005: ";
        str += " (pagination: " + pagination + ")";
        str += " (vehicleStats: " + vehicleStats + ")";
        return str;
    }

}

}
