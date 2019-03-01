package org.openapitools.client.model {


    [XmlRootNode(name="AssetReeferResponseReeferStatsAlarms")]
    public class AssetReeferResponseReeferStatsAlarms {
        /* Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action */
        [XmlElement(name="severity")]
        public var severity: Number = 0;
        /* Recommended operator action */
        [XmlElement(name="operatorAction")]
        public var operatorAction: String = null;
        /* Description of the alarm */
        [XmlElement(name="description")]
        public var description: String = null;
        /* ID of the alarm */
        [XmlElement(name="alarmCode")]
        public var alarmCode: Number = 0;

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStatsAlarms: ";
        str += " (severity: " + severity + ")";
        str += " (operatorAction: " + operatorAction + ")";
        str += " (description: " + description + ")";
        str += " (alarmCode: " + alarmCode + ")";
        return str;
    }

}

}
