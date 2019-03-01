package org.openapitools.client.model {


    [XmlRootNode(name="TaggedAssetBase")]
    public class TaggedAssetBase {
        /* The ID of the Asset being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "TaggedAssetBase: ";
        str += " (id: " + id + ")";
        return str;
    }

}

}
