package org.openapitools.client.model {

import org.openapitools.client.model.Sensor;

    [XmlRootNode(name="InlineResponse2008")]
    public class InlineResponse2008 {
                // This declaration below of _sensors_obj_class is to force flash compiler to include this class
        private var _sensors_obj_class: Array = null;
        [XmlElementWrapper(name="sensors")]
        [XmlElements(name="sensors", type="Array")]
                public var sensors: Array = new Array();

    public function toString(): String {
        var str: String = "InlineResponse2008: ";
        str += " (sensors: " + sensors + ")";
        return str;
    }

}

}
