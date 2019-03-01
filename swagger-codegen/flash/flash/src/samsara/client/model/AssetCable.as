package samsara.client.model {


    [XmlRootNode(name="AssetCable")]
    public class AssetCable {
        /* Asset type */
        [XmlElement(name="assetType")]
        public var assetType: String = null;

    public function toString(): String {
        var str: String = "AssetCable: ";
        str += " (assetType: " + assetType + ")";
        return str;
    }

}

}
