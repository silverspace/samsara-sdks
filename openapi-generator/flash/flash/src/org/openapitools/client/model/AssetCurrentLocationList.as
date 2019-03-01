package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class AssetCurrentLocationList implements ListWrapper {
        // This declaration below of _AssetCurrentLocation_obj_class is to force flash compiler to include this class
        private var _assetCurrentLocation_obj_class: org.openapitools.client.model.AssetCurrentLocation = null;
        [XmlElements(name="assetCurrentLocation", type="org.openapitools.client.model.AssetCurrentLocation")]
        public var assetCurrentLocation: Array = new Array();

        public function getList(): Array{
            return assetCurrentLocation;
        }

}

}
