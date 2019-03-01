package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AssetReeferResponseReeferStatsAlarms1;
import samsara.client.model.AssetReeferResponseReeferStatsEngineHours;
import samsara.client.model.AssetReeferResponseReeferStatsFuelPercentage;
import samsara.client.model.AssetReeferResponseReeferStatsPowerStatus;
import samsara.client.model.AssetReeferResponseReeferStatsReturnAirTemp;
import samsara.client.model.AssetReeferResponseReeferStatsSetPoint;

    public class AssetReeferResponseReeferStatsList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStats_obj_class: samsara.client.model.AssetReeferResponseReeferStats = null;
        [XmlElements(name="assetReeferResponseReeferStats", type="samsara.client.model.AssetReeferResponseReeferStats")]
        public var assetReeferResponseReeferStats: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStats;
        }

}

}
