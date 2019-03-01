package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AssetReeferResponseReeferStatsAlarmsList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_alarms_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsAlarms_obj_class: samsara.client.model.AssetReeferResponseReeferStatsAlarms = null;
        [XmlElements(name="assetReeferResponseReeferStatsAlarms", type="samsara.client.model.AssetReeferResponseReeferStatsAlarms")]
        public var assetReeferResponseReeferStatsAlarms: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsAlarms;
        }

}

}
