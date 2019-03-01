package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class AssetReeferResponseReeferStatsEngineHoursList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_engineHours_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsEngineHours_obj_class: org.openapitools.client.model.AssetReeferResponseReeferStatsEngineHours = null;
        [XmlElements(name="assetReeferResponseReeferStatsEngineHours", type="org.openapitools.client.model.AssetReeferResponseReeferStatsEngineHours")]
        public var assetReeferResponseReeferStatsEngineHours: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsEngineHours;
        }

}

}
