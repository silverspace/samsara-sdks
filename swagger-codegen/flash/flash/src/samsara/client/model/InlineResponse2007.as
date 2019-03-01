package samsara.client.model {

import samsara.client.model.Machine;

    [XmlRootNode(name="InlineResponse2007")]
    public class InlineResponse2007 {
                // This declaration below of _machines_obj_class is to force flash compiler to include this class
        private var _machines_obj_class: Array = null;
        [XmlElementWrapper(name="machines")]
        [XmlElements(name="machines", type="Array")]
                public var machines: Array = new Array();

    public function toString(): String {
        var str: String = "InlineResponse2007: ";
        str += " (machines: " + machines + ")";
        return str;
    }

}

}
