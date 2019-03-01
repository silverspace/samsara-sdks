package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AssetReeferResponseReeferStats;

    public class AssetReeferResponseList implements ListWrapper {
        // This declaration below of _AssetReeferResponse_obj_class is to force flash compiler to include this class
        private var _assetReeferResponse_obj_class: org.openapitools.client.model.AssetReeferResponse = null;
        [XmlElements(name="assetReeferResponse", type="org.openapitools.client.model.AssetReeferResponse")]
        public var assetReeferResponse: Array = new Array();

        public function getList(): Array{
            return assetReeferResponse;
        }

}

}
