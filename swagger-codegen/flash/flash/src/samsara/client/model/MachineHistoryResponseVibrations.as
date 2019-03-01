package samsara.client.model {


    [XmlRootNode(name="MachineHistoryResponseVibrations")]
    public class MachineHistoryResponseVibrations {
                [XmlElement(name="X")]
        public var x: Number = 0.0;
                [XmlElement(name="Y")]
        public var y: Number = 0.0;
                [XmlElement(name="Z")]
        public var z: Number = 0.0;
                [XmlElement(name="time")]
        public var time: Number = 0;

    public function toString(): String {
        var str: String = "MachineHistoryResponseVibrations: ";
        str += " (x: " + x + ")";
        str += " (y: " + y + ")";
        str += " (z: " + z + ")";
        str += " (time: " + time + ")";
        return str;
    }

}

}
