package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TagModifyAdd;
import samsara.client.model.TagModifyDelete;

    public class TagModifyList implements ListWrapper {
        // This declaration below of _TagModify_obj_class is to force flash compiler to include this class
        private var _tagModify_obj_class: samsara.client.model.TagModify = null;
        [XmlElements(name="tagModify", type="samsara.client.model.TagModify")]
        public var tagModify: Array = new Array();

        public function getList(): Array{
            return tagModify;
        }

}

}
