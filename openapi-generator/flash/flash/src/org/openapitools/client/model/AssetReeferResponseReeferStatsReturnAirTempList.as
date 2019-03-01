package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class AssetReeferResponseReeferStatsReturnAirTempList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_returnAirTemp_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsReturnAirTemp_obj_class: org.openapitools.client.model.AssetReeferResponseReeferStatsReturnAirTemp = null;
        [XmlElements(name="assetReeferResponseReeferStatsReturnAirTemp", type="org.openapitools.client.model.AssetReeferResponseReeferStatsReturnAirTemp")]
        public var assetReeferResponseReeferStatsReturnAirTemp: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsReturnAirTemp;
        }

}

}
