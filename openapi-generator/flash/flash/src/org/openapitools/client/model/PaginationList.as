package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class PaginationList implements ListWrapper {
        // This declaration below of _Pagination_obj_class is to force flash compiler to include this class
        private var _pagination_obj_class: org.openapitools.client.model.Pagination = null;
        [XmlElements(name="pagination", type="org.openapitools.client.model.Pagination")]
        public var pagination: Array = new Array();

        public function getList(): Array{
            return pagination;
        }

}

}
