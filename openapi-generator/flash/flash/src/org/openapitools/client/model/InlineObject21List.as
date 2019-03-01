package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.SensorsHistorySeries;

    public class InlineObject21List implements ListWrapper {
        // This declaration below of _inline_object_21_obj_class is to force flash compiler to include this class
        private var _inlineObject21_obj_class: org.openapitools.client.model.InlineObject21 = null;
        [XmlElements(name="inlineObject21", type="org.openapitools.client.model.InlineObject21")]
        public var inlineObject21: Array = new Array();

        public function getList(): Array{
            return inlineObject21;
        }

}

}
