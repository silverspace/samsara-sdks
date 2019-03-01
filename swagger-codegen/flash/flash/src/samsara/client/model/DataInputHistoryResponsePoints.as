package samsara.client.model {


    [XmlRootNode(name="DataInputHistoryResponsePoints")]
    public class DataInputHistoryResponsePoints {
                [XmlElement(name="timeMs")]
        public var timeMs: Number = 0;
                [XmlElement(name="value")]
        public var value: Number = 0.0;

    public function toString(): String {
        var str: String = "DataInputHistoryResponsePoints: ";
        str += " (timeMs: " + timeMs + ")";
        str += " (value: " + value + ")";
        return str;
    }

}

}
