package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class TagIdsList implements ListWrapper {
        // This declaration below of _TagIds_obj_class is to force flash compiler to include this class
        private var _tagIds_obj_class: samsara.client.model.TagIds = null;
        [XmlElements(name="tagIds", type="samsara.client.model.TagIds")]
        public var tagIds: Array = new Array();

        public function getList(): Array{
            return tagIds;
        }

}

}
