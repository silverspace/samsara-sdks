package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AssetLocationResponseInnerList implements ListWrapper {
        // This declaration below of _AssetLocationResponse_inner_obj_class is to force flash compiler to include this class
        private var _assetLocationResponseInner_obj_class: samsara.client.model.AssetLocationResponseInner = null;
        [XmlElements(name="assetLocationResponseInner", type="samsara.client.model.AssetLocationResponseInner")]
        public var assetLocationResponseInner: Array = new Array();

        public function getList(): Array{
            return assetLocationResponseInner;
        }

}

}
