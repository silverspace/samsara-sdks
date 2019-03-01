package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AddressParamList implements ListWrapper {
        // This declaration below of _addressParam_obj_class is to force flash compiler to include this class
        private var _addressParam_obj_class: samsara.client.model.AddressParam = null;
        [XmlElements(name="addressParam", type="samsara.client.model.AddressParam")]
        public var addressParam: Array = new Array();

        public function getList(): Array{
            return addressParam;
        }

}

}
