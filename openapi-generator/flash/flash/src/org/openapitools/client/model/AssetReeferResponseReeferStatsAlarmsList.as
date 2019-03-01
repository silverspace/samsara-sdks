package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class AssetReeferResponseReeferStatsAlarmsList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_alarms_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsAlarms_obj_class: org.openapitools.client.model.AssetReeferResponseReeferStatsAlarms = null;
        [XmlElements(name="assetReeferResponseReeferStatsAlarms", type="org.openapitools.client.model.AssetReeferResponseReeferStatsAlarms")]
        public var assetReeferResponseReeferStatsAlarms: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsAlarms;
        }

}

}
