package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InlineObject4List implements ListWrapper {
        // This declaration below of _inline_object_4_obj_class is to force flash compiler to include this class
        private var _inlineObject4_obj_class: org.openapitools.client.model.InlineObject4 = null;
        [XmlElements(name="inlineObject4", type="org.openapitools.client.model.InlineObject4")]
        public var inlineObject4: Array = new Array();

        public function getList(): Array{
            return inlineObject4;
        }

}

}
