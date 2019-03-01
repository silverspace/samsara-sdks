package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class AssetReeferResponseReeferStatsSetPointList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_setPoint_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsSetPoint_obj_class: org.openapitools.client.model.AssetReeferResponseReeferStatsSetPoint = null;
        [XmlElements(name="assetReeferResponseReeferStatsSetPoint", type="org.openapitools.client.model.AssetReeferResponseReeferStatsSetPoint")]
        public var assetReeferResponseReeferStatsSetPoint: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsSetPoint;
        }

}

}
