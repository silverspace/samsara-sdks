package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.VehicleLocation;

    public class InlineResponse2003List implements ListWrapper {
        // This declaration below of _inline_response_200_3_obj_class is to force flash compiler to include this class
        private var _inlineResponse2003_obj_class: org.openapitools.client.model.InlineResponse2003 = null;
        [XmlElements(name="inlineResponse2003", type="org.openapitools.client.model.InlineResponse2003")]
        public var inlineResponse2003: Array = new Array();

        public function getList(): Array{
            return inlineResponse2003;
        }

}

}
