package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Pagination;
import org.openapitools.client.model.Vehicle;

    public class InlineResponse2002List implements ListWrapper {
        // This declaration below of _inline_response_200_2_obj_class is to force flash compiler to include this class
        private var _inlineResponse2002_obj_class: org.openapitools.client.model.InlineResponse2002 = null;
        [XmlElements(name="inlineResponse2002", type="org.openapitools.client.model.InlineResponse2002")]
        public var inlineResponse2002: Array = new Array();

        public function getList(): Array{
            return inlineResponse2002;
        }

}

}
