package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InlineObject3List implements ListWrapper {
        // This declaration below of _inline_object_3_obj_class is to force flash compiler to include this class
        private var _inlineObject3_obj_class: org.openapitools.client.model.InlineObject3 = null;
        [XmlElements(name="inlineObject3", type="org.openapitools.client.model.InlineObject3")]
        public var inlineObject3: Array = new Array();

        public function getList(): Array{
            return inlineObject3;
        }

}

}
