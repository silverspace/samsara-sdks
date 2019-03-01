package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TaggedAddressBaseList implements ListWrapper {
        // This declaration below of _TaggedAddressBase_obj_class is to force flash compiler to include this class
        private var _taggedAddressBase_obj_class: org.openapitools.client.model.TaggedAddressBase = null;
        [XmlElements(name="taggedAddressBase", type="org.openapitools.client.model.TaggedAddressBase")]
        public var taggedAddressBase: Array = new Array();

        public function getList(): Array{
            return taggedAddressBase;
        }

}

}
