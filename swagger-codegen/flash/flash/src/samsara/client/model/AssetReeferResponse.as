package samsara.client.model {

import samsara.client.model.AssetReeferResponseReeferStats;

    [XmlRootNode(name="AssetReeferResponse")]
    public class AssetReeferResponse {
        /* Asset type */
        [XmlElement(name="assetType")]
        public var assetType: String = null;
        /* Asset ID */
        [XmlElement(name="id")]
        public var id: Number = NaN;
        /* Asset name */
        [XmlElement(name="name")]
        public var name: String = null;
                [XmlElement(name="reeferStats")]
        public var reeferStats: AssetReeferResponseReeferStats = NaN;

    public function toString(): String {
        var str: String = "AssetReeferResponse: ";
        str += " (assetType: " + assetType + ")";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (reeferStats: " + reeferStats + ")";
        return str;
    }

}

}
