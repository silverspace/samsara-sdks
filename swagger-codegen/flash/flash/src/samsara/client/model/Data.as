package samsara.client.model {


    [XmlRootNode(name="Data")]
    public class Data {
                // This declaration below of _externalIds_obj_class is to force flash compiler to include this class
        private var _externalIds_obj_class: Dictionary = null;
        [XmlElementWrapper(name="externalIds")]
        [XmlElements(name="externalIds", type="Dictionary")]
                public var externalIds: Dictionary = new Dictionary();
        /* Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic */
        [XmlElement(name="harsh_accel_setting")]
        public var harshAccelSetting: Number = NaN;
        /* Name */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "Data: ";
        str += " (externalIds: " + externalIds + ")";
        str += " (harshAccelSetting: " + harshAccelSetting + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
