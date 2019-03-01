package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AssetReeferResponseReeferStatsReturnAirTempList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_reeferStats_returnAirTemp_obj_class is to force flash compiler to include this class
        private var _assetReeferResponseReeferStatsReturnAirTemp_obj_class: samsara.client.model.AssetReeferResponseReeferStatsReturnAirTemp = null;
        [XmlElements(name="assetReeferResponseReeferStatsReturnAirTemp", type="samsara.client.model.AssetReeferResponseReeferStatsReturnAirTemp")]
        public var assetReeferResponseReeferStatsReturnAirTemp: Array = new Array();

        public function getList(): Array{
            return assetReeferResponseReeferStatsReturnAirTemp;
        }

}

}
