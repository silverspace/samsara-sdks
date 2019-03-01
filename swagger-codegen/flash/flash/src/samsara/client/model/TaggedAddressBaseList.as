package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class TaggedAddressBaseList implements ListWrapper {
        // This declaration below of _TaggedAddressBase_obj_class is to force flash compiler to include this class
        private var _taggedAddressBase_obj_class: samsara.client.model.TaggedAddressBase = null;
        [XmlElements(name="taggedAddressBase", type="samsara.client.model.TaggedAddressBase")]
        public var taggedAddressBase: Array = new Array();

        public function getList(): Array{
            return taggedAddressBase;
        }

}

}
