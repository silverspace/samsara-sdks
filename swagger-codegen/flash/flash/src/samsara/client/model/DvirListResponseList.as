package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DvirBase;

    public class DvirListResponseList implements ListWrapper {
        // This declaration below of _DvirListResponse_obj_class is to force flash compiler to include this class
        private var _dvirListResponse_obj_class: samsara.client.model.DvirListResponse = null;
        [XmlElements(name="dvirListResponse", type="samsara.client.model.DvirListResponse")]
        public var dvirListResponse: Array = new Array();

        public function getList(): Array{
            return dvirListResponse;
        }

}

}
