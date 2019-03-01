package org.openapitools.client.model {


    [XmlRootNode(name="AssetReeferResponseReeferStatsSetPoint")]
    public class AssetReeferResponseReeferStatsSetPoint {
        /* Set point temperature in millidegree Celsius. */
        [XmlElement(name="tempInMilliC")]
        public var tempInMilliC: Number = 0;
        /* Timestamp in Unix milliseconds since epoch. */
        [XmlElement(name="changedAtMs")]
        public var changedAtMs: Number = 0;

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStatsSetPoint: ";
        str += " (tempInMilliC: " + tempInMilliC + ")";
        str += " (changedAtMs: " + changedAtMs + ")";
        return str;
    }

}

}
