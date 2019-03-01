package samsara.client.model {


    [XmlRootNode(name="AuxInput")]
    public class AuxInput {
        /* Timestamp in Unix epoch milliseconds. */
        [XmlElement(name="timeMs")]
        public var timeMs: Number = NaN;
        /* Boolean representing the digital value of the aux input. */
        [XmlElement(name="value")]
        public var value: Boolean = false;

    public function toString(): String {
        var str: String = "AuxInput: ";
        str += " (timeMs: " + timeMs + ")";
        str += " (value: " + value + ")";
        return str;
    }

}

}
