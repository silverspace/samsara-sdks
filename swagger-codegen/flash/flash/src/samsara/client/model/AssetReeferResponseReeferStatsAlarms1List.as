package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AssetReeferResponseReeferStatsAlarms;

    public class AssetReeferResponseReeferStatsAlarms1List implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_alarms_1_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsAlarms1_obj_class: samsara.client.model.AssetReeferResponseReeferStatsAlarms1 = null;
        [XmlElements(name="assetReeferResponseReeferStatsAlarms1", type="samsara.client.model.AssetReeferResponseReeferStatsAlarms1")]
        public var assetReeferResponseReeferStatsAlarms1: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsAlarms1;
        }

}

}
