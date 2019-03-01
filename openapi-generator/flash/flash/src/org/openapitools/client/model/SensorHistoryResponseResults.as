package org.openapitools.client.model {


    [XmlRootNode(name="SensorHistoryResponseResults")]
    public class SensorHistoryResponseResults {
        /* List of datapoints, one for each requested (sensor, field) pair. */
        // This declaration below of _series_obj_class is to force flash compiler to include this class
        private var _series_obj_class: Array = null;
        [XmlElementWrapper(name="series")]
        [XmlElements(name="series", type="Array")]
                public var series: Array = new Array();
        /* Timestamp in UNIX milliseconds. */
        [XmlElement(name="timeMs")]
        public var timeMs: Number = 0;

    public function toString(): String {
        var str: String = "SensorHistoryResponseResults: ";
        str += " (series: " + series + ")";
        str += " (timeMs: " + timeMs + ")";
        return str;
    }

}

}
