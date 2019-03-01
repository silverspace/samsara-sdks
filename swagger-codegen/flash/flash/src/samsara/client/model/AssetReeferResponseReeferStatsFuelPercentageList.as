package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AssetReeferResponseReeferStatsFuelPercentageList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_fuelPercentage_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsFuelPercentage_obj_class: samsara.client.model.AssetReeferResponseReeferStatsFuelPercentage = null;
        [XmlElements(name="assetReeferResponseReeferStatsFuelPercentage", type="samsara.client.model.AssetReeferResponseReeferStatsFuelPercentage")]
        public var assetReeferResponseReeferStatsFuelPercentage: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsFuelPercentage;
        }

}

}
