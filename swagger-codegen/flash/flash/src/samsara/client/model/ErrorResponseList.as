package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class ErrorResponseList implements ListWrapper {
        // This declaration below of _ErrorResponse_obj_class is to force flash compiler to include this class
        private var _errorResponse_obj_class: samsara.client.model.ErrorResponse = null;
        [XmlElements(name="errorResponse", type="samsara.client.model.ErrorResponse")]
        public var errorResponse: Array = new Array();

        public function getList(): Array{
            return errorResponse;
        }

}

}
