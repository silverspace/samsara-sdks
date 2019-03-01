package org.openapitools.client.model {

import org.openapitools.client.model.MachineHistoryResponseMachines;

    [XmlRootNode(name="MachineHistoryResponse")]
    public class MachineHistoryResponse {
                // This declaration below of _machines_obj_class is to force flash compiler to include this class
        private var _machines_obj_class: Array = null;
        [XmlElementWrapper(name="machines")]
        [XmlElements(name="machines", type="Array")]
                public var machines: Array = new Array();

    public function toString(): String {
        var str: String = "MachineHistoryResponse: ";
        str += " (machines: " + machines + ")";
        return str;
    }

}

}
