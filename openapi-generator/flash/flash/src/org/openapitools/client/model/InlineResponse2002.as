package org.openapitools.client.model {

import org.openapitools.client.model.Pagination;
import org.openapitools.client.model.Vehicle;

    [XmlRootNode(name="InlineResponse2002")]
    public class InlineResponse2002 {
                [XmlElement(name="pagination")]
        public var pagination: Pagination = NaN;
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
                // This declaration below of _vehicles_obj_class is to force flash compiler to include this class
        private var _vehicles_obj_class: Array = null;
        [XmlElementWrapper(name="vehicles")]
        [XmlElements(name="vehicles", type="Array")]
                public var vehicles: Array = new Array();

    public function toString(): String {
        var str: String = "InlineResponse2002: ";
        str += " (pagination: " + pagination + ")";
        str += " (groupId: " + groupId + ")";
        str += " (vehicles: " + vehicles + ")";
        return str;
    }

}

}
