package samsara.client.model {


    [XmlRootNode(name="AssetReeferResponseReeferStatsReturnAirTemp")]
    public class AssetReeferResponseReeferStatsReturnAirTemp {
        /* Timestamp in Unix milliseconds since epoch. */
        [XmlElement(name="changedAtMs")]
        public var changedAtMs: Number = 0;
        /* Return air temperature in millidegree Celsius. */
        [XmlElement(name="tempInMilliC")]
        public var tempInMilliC: Number = 0;

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStatsReturnAirTemp: ";
        str += " (changedAtMs: " + changedAtMs + ")";
        str += " (tempInMilliC: " + tempInMilliC + ")";
        return str;
    }

}

}
