package samsara.client.model {

import samsara.client.model.TaggedAssetBase;

    [XmlRootNode(name="TaggedAsset")]
    public class TaggedAsset {
        /* The ID of the Asset being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the Asset being tagged. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "TaggedAsset: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
