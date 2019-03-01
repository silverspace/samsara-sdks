package samsara.client.model {


    [XmlRootNode(name="AssetReeferResponseReeferStatsFuelPercentage")]
    public class AssetReeferResponseReeferStatsFuelPercentage {
        /* Timestamp in Unix milliseconds since epoch. */
        [XmlElement(name="changedAtMs")]
        public var changedAtMs: Number = 0;
        /* Fuel percentage of the reefer. */
        [XmlElement(name="fuelPercentage")]
        public var fuelPercentage: Number = 0;

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStatsFuelPercentage: ";
        str += " (changedAtMs: " + changedAtMs + ")";
        str += " (fuelPercentage: " + fuelPercentage + ")";
        return str;
    }

}

}
