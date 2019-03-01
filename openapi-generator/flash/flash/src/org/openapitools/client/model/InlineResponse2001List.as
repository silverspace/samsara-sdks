package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AssetCurrentLocationsResponse;

    public class InlineResponse2001List implements ListWrapper {
        // This declaration below of _inline_response_200_1_obj_class is to force flash compiler to include this class
        private var _inlineResponse2001_obj_class: org.openapitools.client.model.InlineResponse2001 = null;
        [XmlElements(name="inlineResponse2001", type="org.openapitools.client.model.InlineResponse2001")]
        public var inlineResponse2001: Array = new Array();

        public function getList(): Array{
            return inlineResponse2001;
        }

}

}
