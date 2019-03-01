package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AssetCable;
import org.openapitools.client.model.AssetCurrentLocation;

    public class AssetCurrentLocationsResponseList implements ListWrapper {
        // This declaration below of _AssetCurrentLocationsResponse_obj_class is to force flash compiler to include this class
        private var _assetCurrentLocationsResponse_obj_class: org.openapitools.client.model.AssetCurrentLocationsResponse = null;
        [XmlElements(name="assetCurrentLocationsResponse", type="org.openapitools.client.model.AssetCurrentLocationsResponse")]
        public var assetCurrentLocationsResponse: Array = new Array();

        public function getList(): Array{
            return assetCurrentLocationsResponse;
        }

}

}
