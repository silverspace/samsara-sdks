package org.openapitools.client.model {

import org.openapitools.client.model.Object;

    [XmlRootNode(name="EngineState")]
    public class EngineState {
        /* Timestamp in Unix epoch milliseconds. */
        [XmlElement(name="timeMs")]
        public var timeMs: Object = 0.0;
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
