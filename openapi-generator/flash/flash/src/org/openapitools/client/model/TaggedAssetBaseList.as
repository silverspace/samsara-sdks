package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TaggedAssetBaseList implements ListWrapper {
        // This declaration below of _TaggedAssetBase_obj_class is to force flash compiler to include this class
        private var _taggedAssetBase_obj_class: org.openapitools.client.model.TaggedAssetBase = null;
        [XmlElements(name="taggedAssetBase", type="org.openapitools.client.model.TaggedAssetBase")]
        public var taggedAssetBase: Array = new Array();

        public function getList(): Array{
            return taggedAssetBase;
        }

}

}
