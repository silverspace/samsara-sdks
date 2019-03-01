package org.openapitools.client.model {

import org.openapitools.client.model.Object;

    [XmlRootNode(name="AuxInput")]
    public class AuxInput {
        /* Timestamp in Unix epoch milliseconds. */
        [XmlElement(name="timeMs")]
        public var timeMs: Object = 0.0;
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
