package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InlineObject7List implements ListWrapper {
        // This declaration below of _inline_object_7_obj_class is to force flash compiler to include this class
        private var _inlineObject7_obj_class: org.openapitools.client.model.InlineObject7 = null;
        [XmlElements(name="inlineObject7", type="org.openapitools.client.model.InlineObject7")]
        public var inlineObject7: Array = new Array();

        public function getList(): Array{
            return inlineObject7;
        }

}

}
