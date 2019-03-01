package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AssetCable;

    public class AssetList implements ListWrapper {
        // This declaration below of _Asset_obj_class is to force flash compiler to include this class
        private var _asset_obj_class: org.openapitools.client.model.Asset = null;
        [XmlElements(name="asset", type="org.openapitools.client.model.Asset")]
        public var asset: Array = new Array();

        public function getList(): Array{
            return asset;
        }

}

}
