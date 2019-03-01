package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DvirBase;

    public class DvirListResponseList implements ListWrapper {
        // This declaration below of _DvirListResponse_obj_class is to force flash compiler to include this class
        private var _dvirListResponse_obj_class: org.openapitools.client.model.DvirListResponse = null;
        [XmlElements(name="dvirListResponse", type="org.openapitools.client.model.DvirListResponse")]
        public var dvirListResponse: Array = new Array();

        public function getList(): Array{
            return dvirListResponse;
        }

}

}
