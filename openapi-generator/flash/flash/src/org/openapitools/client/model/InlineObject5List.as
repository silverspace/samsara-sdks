package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InlineObject5List implements ListWrapper {
        // This declaration below of _inline_object_5_obj_class is to force flash compiler to include this class
        private var _inlineObject5_obj_class: org.openapitools.client.model.InlineObject5 = null;
        [XmlElements(name="inlineObject5", type="org.openapitools.client.model.InlineObject5")]
        public var inlineObject5: Array = new Array();

        public function getList(): Array{
            return inlineObject5;
        }

}

}
