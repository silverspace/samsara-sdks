package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedAddressBase;

    public class TaggedAddressList implements ListWrapper {
        // This declaration below of _TaggedAddress_obj_class is to force flash compiler to include this class
        private var _taggedAddress_obj_class: samsara.client.model.TaggedAddress = null;
        [XmlElements(name="taggedAddress", type="samsara.client.model.TaggedAddress")]
        public var taggedAddress: Array = new Array();

        public function getList(): Array{
            return taggedAddress;
        }

}

}
