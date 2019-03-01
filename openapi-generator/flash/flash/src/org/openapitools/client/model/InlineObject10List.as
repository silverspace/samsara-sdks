package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InlineObject10List implements ListWrapper {
        // This declaration below of _inline_object_10_obj_class is to force flash compiler to include this class
        private var _inlineObject10_obj_class: org.openapitools.client.model.InlineObject10 = null;
        [XmlElements(name="inlineObject10", type="org.openapitools.client.model.InlineObject10")]
        public var inlineObject10: Array = new Array();

        public function getList(): Array{
            return inlineObject10;
        }

}

}
