package samsara.client.model {


    [XmlRootNode(name="AssetReeferResponseReeferStatsSetPoint")]
    public class AssetReeferResponseReeferStatsSetPoint {
        /* Timestamp in Unix milliseconds since epoch. */
        [XmlElement(name="changedAtMs")]
        public var changedAtMs: Number = 0;
        /* Set point temperature in millidegree Celsius. */
        [XmlElement(name="tempInMilliC")]
        public var tempInMilliC: Number = 0;

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStatsSetPoint: ";
        str += " (changedAtMs: " + changedAtMs + ")";
        str += " (tempInMilliC: " + tempInMilliC + ")";
        return str;
    }

}

}
