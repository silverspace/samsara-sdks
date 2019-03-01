package org.openapitools.client.model {

import org.openapitools.client.model.DataInputHistoryResponse;

    [XmlRootNode(name="InlineResponse2006")]
    public class InlineResponse2006 {
                // This declaration below of _dataInputs_obj_class is to force flash compiler to include this class
        private var _dataInputs_obj_class: Array = null;
        [XmlElementWrapper(name="dataInputs")]
        [XmlElements(name="dataInputs", type="Array")]
                public var dataInputs: Array = new Array();

    public function toString(): String {
        var str: String = "InlineResponse2006: ";
        str += " (dataInputs: " + dataInputs + ")";
        return str;
    }

}

}
