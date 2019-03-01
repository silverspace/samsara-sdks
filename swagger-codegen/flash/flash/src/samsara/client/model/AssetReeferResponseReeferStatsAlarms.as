package samsara.client.model {


    [XmlRootNode(name="AssetReeferResponseReeferStatsAlarms")]
    public class AssetReeferResponseReeferStatsAlarms {
        /* ID of the alarm */
        [XmlElement(name="alarmCode")]
        public var alarmCode: Number = 0;
        /* Description of the alarm */
        [XmlElement(name="description")]
        public var description: String = null;
        /* Recommended operator action */
        [XmlElement(name="operatorAction")]
        public var operatorAction: String = null;
        /* Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action */
        [XmlElement(name="severity")]
        public var severity: Number = 0;

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStatsAlarms: ";
        str += " (alarmCode: " + alarmCode + ")";
        str += " (description: " + description + ")";
        str += " (operatorAction: " + operatorAction + ")";
        str += " (severity: " + severity + ")";
        return str;
    }

}

}
