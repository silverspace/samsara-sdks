package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AssetCableList implements ListWrapper {
        // This declaration below of _Asset_cable_obj_class is to force flash compiler to include this class
        private var _assetCable_obj_class: samsara.client.model.AssetCable = null;
        [XmlElements(name="assetCable", type="samsara.client.model.AssetCable")]
        public var assetCable: Array = new Array();

        public function getList(): Array{
            return assetCable;
        }

}

}
