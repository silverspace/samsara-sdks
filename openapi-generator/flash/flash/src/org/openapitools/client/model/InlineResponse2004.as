package org.openapitools.client.model {

import org.openapitools.client.model.VehicleMaintenance;

    [XmlRootNode(name="InlineResponse2004")]
    public class InlineResponse2004 {
                // This declaration below of _vehicles_obj_class is to force flash compiler to include this class
        private var _vehicles_obj_class: Array = null;
        [XmlElementWrapper(name="vehicles")]
        [XmlElements(name="vehicles", type="Array")]
                public var vehicles: Array = new Array();

    public function toString(): String {
        var str: String = "InlineResponse2004: ";
        str += " (vehicles: " + vehicles + ")";
        return str;
    }

}

}
