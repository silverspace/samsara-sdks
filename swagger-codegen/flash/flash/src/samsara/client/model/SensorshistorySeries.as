package samsara.client.model {


    [XmlRootNode(name="SensorshistorySeries")]
    public class SensorshistorySeries {
        /* Field to query. */
        [XmlElement(name="field")]
        public var field: String = null;
        /* Sensor ID to query. */
        [XmlElement(name="widgetId")]
        public var widgetId: Number = 0;

    public function toString(): String {
        var str: String = "SensorshistorySeries: ";
        str += " (field: " + field + ")";
        str += " (widgetId: " + widgetId + ")";
        return str;
    }

}

}
