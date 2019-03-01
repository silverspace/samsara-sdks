package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedAssetBase;

    public class TaggedAssetList implements ListWrapper {
        // This declaration below of _TaggedAsset_obj_class is to force flash compiler to include this class
        private var _taggedAsset_obj_class: samsara.client.model.TaggedAsset = null;
        [XmlElements(name="taggedAsset", type="samsara.client.model.TaggedAsset")]
        public var taggedAsset: Array = new Array();

        public function getList(): Array{
            return taggedAsset;
        }

}

}
