package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AssetReeferResponseReeferStats;

    public class AssetReeferResponseList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_obj_class is to force flash compiler to include this class
        private var _assetReeferResponse_obj_class: samsara.client.model.AssetReeferResponse = null;
        [XmlElements(name="assetReeferResponse", type="samsara.client.model.AssetReeferResponse")]
        public var assetReeferResponse: Array = new Array();

        public function getList(): Array{
            return assetReeferResponse;
        }

}

}
