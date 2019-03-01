package samsara.client.model {


    [XmlRootNode(name="EngineState")]
    public class EngineState {
        /* Timestamp in Unix epoch milliseconds. */
        [XmlElement(name="timeMs")]
        public var timeMs: Number = NaN;
                [XmlElement(name="value")]
        public var value: String = null;

    public function toString(): String {
        var str: String = "EngineState: ";
        str += " (timeMs: " + timeMs + ")";
        str += " (value: " + value + ")";
        return str;
    }

}

}
