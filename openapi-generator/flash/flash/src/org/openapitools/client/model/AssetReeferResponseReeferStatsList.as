package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AssetReeferResponseReeferStatsAlarms1;
import org.openapitools.client.model.AssetReeferResponseReeferStatsEngineHours;
import org.openapitools.client.model.AssetReeferResponseReeferStatsFuelPercentage;
import org.openapitools.client.model.AssetReeferResponseReeferStatsPowerStatus;
import org.openapitools.client.model.AssetReeferResponseReeferStatsReturnAirTemp;
import org.openapitools.client.model.AssetReeferResponseReeferStatsSetPoint;

    public class AssetReeferResponseReeferStatsList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStats_obj_class: org.openapitools.client.model.AssetReeferResponseReeferStats = null;
        [XmlElements(name="assetReeferResponseReeferStats", type="org.openapitools.client.model.AssetReeferResponseReeferStats")]
        public var assetReeferResponseReeferStats: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStats;
        }

}

}
