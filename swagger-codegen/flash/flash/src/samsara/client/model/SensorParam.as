package samsara.client.model {


    [XmlRootNode(name="SensorParam")]
    public class SensorParam {
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* List of sensor IDs to query. */
        // This declaration below of _sensors_obj_class is to force flash compiler to include this class
        private var _sensors_obj_class: Array = null;
        [XmlElementWrapper(name="sensors")]
        [XmlElements(name="sensors", type="Array")]
                public var sensors: Array = new Array();

    public function toString(): String {
        var str: String = "SensorParam: ";
        str += " (groupId: " + groupId + ")";
        str += " (sensors: " + sensors + ")";
        return str;
    }

}

}
