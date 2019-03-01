package samsara.client.model {


    [XmlRootNode(name="AssetReeferResponseReeferStatsEngineHours")]
    public class AssetReeferResponseReeferStatsEngineHours {
        /* Timestamp in Unix milliseconds since epoch. */
        [XmlElement(name="changedAtMs")]
        public var changedAtMs: Number = 0;
        /* Engine hours of the reefer. */
        [XmlElement(name="engineHours")]
        public var engineHours: Number = 0;

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStatsEngineHours: ";
        str += " (changedAtMs: " + changedAtMs + ")";
        str += " (engineHours: " + engineHours + ")";
        return str;
    }

}

}
