package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TagModifyAdd;
import org.openapitools.client.model.TagModifyDelete;

    public class TagModifyList implements ListWrapper {
        // This declaration below of _TagModify_obj_class is to force flash compiler to include this class
        private var _tagModify_obj_class: org.openapitools.client.model.TagModify = null;
        [XmlElements(name="tagModify", type="org.openapitools.client.model.TagModify")]
        public var tagModify: Array = new Array();

        public function getList(): Array{
            return tagModify;
        }

}

}
