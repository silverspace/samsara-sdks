package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AssetCable;
import samsara.client.model.AssetCurrentLocation;

    public class AssetCurrentLocationsResponseList implements ListWrapper {
        // This declaration below of _AssetCurrentLocationsResponse_obj_class is to force flash compiler to include this class
        private var _assetCurrentLocationsResponse_obj_class: samsara.client.model.AssetCurrentLocationsResponse = null;
        [XmlElements(name="assetCurrentLocationsResponse", type="samsara.client.model.AssetCurrentLocationsResponse")]
        public var assetCurrentLocationsResponse: Array = new Array();

        public function getList(): Array{
            return assetCurrentLocationsResponse;
        }

}

}
