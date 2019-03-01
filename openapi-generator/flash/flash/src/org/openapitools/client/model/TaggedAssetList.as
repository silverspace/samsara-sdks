package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaggedAssetBase;

    public class TaggedAssetList implements ListWrapper {
        // This declaration below of _TaggedAsset_obj_class is to force flash compiler to include this class
        private var _taggedAsset_obj_class: org.openapitools.client.model.TaggedAsset = null;
        [XmlElements(name="taggedAsset", type="org.openapitools.client.model.TaggedAsset")]
        public var taggedAsset: Array = new Array();

        public function getList(): Array{
            return taggedAsset;
        }

}

}
