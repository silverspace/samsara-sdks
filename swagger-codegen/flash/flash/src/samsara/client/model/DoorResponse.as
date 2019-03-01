package samsara.client.model {

import samsara.client.model.DoorResponseSensors;

    [XmlRootNode(name="DoorResponse")]
    public class DoorResponse {
                [XmlElement(name="groupId")]
        public var groupId: Number = 0;
                // This declaration below of _sensors_obj_class is to force flash compiler to include this class
        private var _sensors_obj_class: Array = null;
        [XmlElementWrapper(name="sensors")]
        [XmlElements(name="sensors", type="Array")]
                public var sensors: Array = new Array();

    public function toString(): String {
        var str: String = "DoorResponse: ";
        str += " (groupId: " + groupId + ")";
        str += " (sensors: " + sensors + ")";
        return str;
    }

}

}
