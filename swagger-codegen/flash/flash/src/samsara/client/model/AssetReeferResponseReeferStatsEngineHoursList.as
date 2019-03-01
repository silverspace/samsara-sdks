package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AssetReeferResponseReeferStatsEngineHoursList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_engineHours_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsEngineHours_obj_class: samsara.client.model.AssetReeferResponseReeferStatsEngineHours = null;
        [XmlElements(name="assetReeferResponseReeferStatsEngineHours", type="samsara.client.model.AssetReeferResponseReeferStatsEngineHours")]
        public var assetReeferResponseReeferStatsEngineHours: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsEngineHours;
        }

}

}
