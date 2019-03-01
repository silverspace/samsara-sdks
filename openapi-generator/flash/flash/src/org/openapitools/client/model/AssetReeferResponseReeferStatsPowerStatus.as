package org.openapitools.client.model {


    [XmlRootNode(name="AssetReeferResponseReeferStatsPowerStatus")]
    public class AssetReeferResponseReeferStatsPowerStatus {
        /* Timestamp in Unix milliseconds since epoch. */
        [XmlElement(name="changedAtMs")]
        public var changedAtMs: Number = 0;
        /* Power status of the reefer. */
        [XmlElement(name="status")]
        public var status: String = null;

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStatsPowerStatus: ";
        str += " (changedAtMs: " + changedAtMs + ")";
        str += " (status: " + status + ")";
        return str;
    }

}

}
