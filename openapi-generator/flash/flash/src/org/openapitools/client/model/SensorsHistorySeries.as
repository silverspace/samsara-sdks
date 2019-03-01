package org.openapitools.client.model {


    [XmlRootNode(name="SensorsHistorySeries")]
    public class SensorsHistorySeries {
        /* Field to query. */
        [XmlElement(name="field")]
        public var field: String = null;
        /* Sensor ID to query. */
        [XmlElement(name="widgetId")]
        public var widgetId: Number = 0;

    public function toString(): String {
        var str: String = "SensorsHistorySeries: ";
        str += " (field: " + field + ")";
        str += " (widgetId: " + widgetId + ")";
        return str;
    }

}

}
