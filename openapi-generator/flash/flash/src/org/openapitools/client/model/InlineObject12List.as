package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InlineObject12List implements ListWrapper {
        // This declaration below of _inline_object_12_obj_class is to force flash compiler to include this class
        private var _inlineObject12_obj_class: org.openapitools.client.model.InlineObject12 = null;
        [XmlElements(name="inlineObject12", type="org.openapitools.client.model.InlineObject12")]
        public var inlineObject12: Array = new Array();

        public function getList(): Array{
            return inlineObject12;
        }

}

}
