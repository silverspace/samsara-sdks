package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AssetReeferResponseReeferStatsPowerStatusList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_powerStatus_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsPowerStatus_obj_class: samsara.client.model.AssetReeferResponseReeferStatsPowerStatus = null;
        [XmlElements(name="assetReeferResponseReeferStatsPowerStatus", type="samsara.client.model.AssetReeferResponseReeferStatsPowerStatus")]
        public var assetReeferResponseReeferStatsPowerStatus: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsPowerStatus;
        }

}

}
