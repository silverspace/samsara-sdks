package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedDriverBase;

    public class TaggedDriverList implements ListWrapper {
        // This declaration below of _TaggedDriver_obj_class is to force flash compiler to include this class
        private var _taggedDriver_obj_class: samsara.client.model.TaggedDriver = null;
        [XmlElements(name="taggedDriver", type="samsara.client.model.TaggedDriver")]
        public var taggedDriver: Array = new Array();

        public function getList(): Array{
            return taggedDriver;
        }

}

}
