package org.openapitools.client.model {


    [XmlRootNode(name="DataInputHistoryResponsePoints")]
    public class DataInputHistoryResponsePoints {
                [XmlElement(name="value")]
        public var value: Number = 0.0;
                [XmlElement(name="timeMs")]
        public var timeMs: Number = 0;

    public function toString(): String {
        var str: String = "DataInputHistoryResponsePoints: ";
        str += " (value: " + value + ")";
        str += " (timeMs: " + timeMs + ")";
        return str;
    }

}

}
