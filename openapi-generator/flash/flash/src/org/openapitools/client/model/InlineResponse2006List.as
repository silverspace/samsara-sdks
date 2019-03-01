package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DataInputHistoryResponse;

    public class InlineResponse2006List implements ListWrapper {
        // This declaration below of _inline_response_200_6_obj_class is to force flash compiler to include this class
        private var _inlineResponse2006_obj_class: org.openapitools.client.model.InlineResponse2006 = null;
        [XmlElements(name="inlineResponse2006", type="org.openapitools.client.model.InlineResponse2006")]
        public var inlineResponse2006: Array = new Array();

        public function getList(): Array{
            return inlineResponse2006;
        }

}

}
