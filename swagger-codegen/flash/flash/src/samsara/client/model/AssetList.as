package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AssetCable;

    public class AssetList implements ListWrapper {
        // This declaration below of _Asset_obj_class is to force flash compiler to include this class
        private var _asset_obj_class: samsara.client.model.Asset = null;
        [XmlElements(name="asset", type="samsara.client.model.Asset")]
        public var asset: Array = new Array();

        public function getList(): Array{
            return asset;
        }

}

}
