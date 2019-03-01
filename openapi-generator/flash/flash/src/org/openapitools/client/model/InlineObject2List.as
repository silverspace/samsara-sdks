package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InlineObject2List implements ListWrapper {
        // This declaration below of _inline_object_2_obj_class is to force flash compiler to include this class
        private var _inlineObject2_obj_class: org.openapitools.client.model.InlineObject2 = null;
        [XmlElements(name="inlineObject2", type="org.openapitools.client.model.InlineObject2")]
        public var inlineObject2: Array = new Array();

        public function getList(): Array{
            return inlineObject2;
        }

}

}
