package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AssetLocationResponseInner;

    public class AssetLocationResponseList implements ListWrapper {
        // This declaration below of _AssetLocationResponse_obj_class is to force flash compiler to include this class
        private var _assetLocationResponse_obj_class: samsara.client.model.AssetLocationResponse = null;
        [XmlElements(name="assetLocationResponse", type="samsara.client.model.AssetLocationResponse")]
        public var assetLocationResponse: Array = new Array();

        public function getList(): Array{
            return assetLocationResponse;
        }

}

}
