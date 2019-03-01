package org.openapitools.client.model {

import org.openapitools.client.model.Vehicle;

    [XmlRootNode(name="InlineObject14")]
    public class InlineObject14 {
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
                // This declaration below of _vehicles_obj_class is to force flash compiler to include this class
        private var _vehicles_obj_class: Array = null;
        [XmlElementWrapper(name="vehicles")]
        [XmlElements(name="vehicles", type="Array")]
                public var vehicles: Array = new Array();

    public function toString(): String {
        var str: String = "InlineObject14: ";
        str += " (groupId: " + groupId + ")";
        str += " (vehicles: " + vehicles + ")";
        return str;
    }

}

}
