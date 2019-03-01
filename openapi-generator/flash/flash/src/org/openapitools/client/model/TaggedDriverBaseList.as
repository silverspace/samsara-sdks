package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TaggedDriverBaseList implements ListWrapper {
        // This declaration below of _TaggedDriverBase_obj_class is to force flash compiler to include this class
        private var _taggedDriverBase_obj_class: org.openapitools.client.model.TaggedDriverBase = null;
        [XmlElements(name="taggedDriverBase", type="org.openapitools.client.model.TaggedDriverBase")]
        public var taggedDriverBase: Array = new Array();

        public function getList(): Array{
            return taggedDriverBase;
        }

}

}
