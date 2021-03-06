package org.openapitools.client.model {

import org.openapitools.client.model.TemperatureResponseSensors;

    [XmlRootNode(name="TemperatureResponse")]
    public class TemperatureResponse {
                [XmlElement(name="groupId")]
        public var groupId: Number = 0;
                // This declaration below of _sensors_obj_class is to force flash compiler to include this class
        private var _sensors_obj_class: Array = null;
        [XmlElementWrapper(name="sensors")]
        [XmlElements(name="sensors", type="Array")]
                public var sensors: Array = new Array();

    public function toString(): String {
        var str: String = "TemperatureResponse: ";
        str += " (groupId: " + groupId + ")";
        str += " (sensors: " + sensors + ")";
        return str;
    }

}

}
