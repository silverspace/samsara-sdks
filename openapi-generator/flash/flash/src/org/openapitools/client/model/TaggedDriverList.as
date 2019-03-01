package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaggedDriverBase;

    public class TaggedDriverList implements ListWrapper {
        // This declaration below of _TaggedDriver_obj_class is to force flash compiler to include this class
        private var _taggedDriver_obj_class: org.openapitools.client.model.TaggedDriver = null;
        [XmlElements(name="taggedDriver", type="org.openapitools.client.model.TaggedDriver")]
        public var taggedDriver: Array = new Array();

        public function getList(): Array{
            return taggedDriver;
        }

}

}
