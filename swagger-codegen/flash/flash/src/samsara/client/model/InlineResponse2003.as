package samsara.client.model {

import samsara.client.model.VehicleLocation;

    [XmlRootNode(name="InlineResponse2003")]
    public class InlineResponse2003 {
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
                // This declaration below of _vehicles_obj_class is to force flash compiler to include this class
        private var _vehicles_obj_class: Array = null;
        [XmlElementWrapper(name="vehicles")]
        [XmlElements(name="vehicles", type="Array")]
                public var vehicles: Array = new Array();

    public function toString(): String {
        var str: String = "InlineResponse2003: ";
        str += " (groupId: " + groupId + ")";
        str += " (vehicles: " + vehicles + ")";
        return str;
    }

}

}
