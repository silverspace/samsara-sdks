package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AssetReeferResponseReeferStatsSetPointList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_setPoint_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsSetPoint_obj_class: samsara.client.model.AssetReeferResponseReeferStatsSetPoint = null;
        [XmlElements(name="assetReeferResponseReeferStatsSetPoint", type="samsara.client.model.AssetReeferResponseReeferStatsSetPoint")]
        public var assetReeferResponseReeferStatsSetPoint: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsSetPoint;
        }

}

}
