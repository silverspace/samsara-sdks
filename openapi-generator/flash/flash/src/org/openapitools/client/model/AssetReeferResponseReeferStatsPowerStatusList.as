package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class AssetReeferResponseReeferStatsPowerStatusList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_powerStatus_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsPowerStatus_obj_class: org.openapitools.client.model.AssetReeferResponseReeferStatsPowerStatus = null;
        [XmlElements(name="assetReeferResponseReeferStatsPowerStatus", type="org.openapitools.client.model.AssetReeferResponseReeferStatsPowerStatus")]
        public var assetReeferResponseReeferStatsPowerStatus: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsPowerStatus;
        }

}

}
