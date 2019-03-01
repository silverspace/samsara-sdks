package org.openapitools.client.model {


    [XmlRootNode(name="AssetReeferResponseReeferStatsEngineHours")]
    public class AssetReeferResponseReeferStatsEngineHours {
        /* Engine hours of the reefer. */
        [XmlElement(name="engineHours")]
        public var engineHours: Number = 0;
        /* Timestamp in Unix milliseconds since epoch. */
        [XmlElement(name="changedAtMs")]
        public var changedAtMs: Number = 0;

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStatsEngineHours: ";
        str += " (engineHours: " + engineHours + ")";
        str += " (changedAtMs: " + changedAtMs + ")";
        return str;
    }

}

}
