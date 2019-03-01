package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InlineObject11List implements ListWrapper {
        // This declaration below of _inline_object_11_obj_class is to force flash compiler to include this class
        private var _inlineObject11_obj_class: org.openapitools.client.model.InlineObject11 = null;
        [XmlElements(name="inlineObject11", type="org.openapitools.client.model.InlineObject11")]
        public var inlineObject11: Array = new Array();

        public function getList(): Array{
            return inlineObject11;
        }

}

}
