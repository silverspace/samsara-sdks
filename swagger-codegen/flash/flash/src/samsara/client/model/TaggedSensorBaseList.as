package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class TaggedSensorBaseList implements ListWrapper {
        // This declaration below of _TaggedSensorBase_obj_class is to force flash compiler to include this class
        private var _taggedSensorBase_obj_class: samsara.client.model.TaggedSensorBase = null;
        [XmlElements(name="taggedSensorBase", type="samsara.client.model.TaggedSensorBase")]
        public var taggedSensorBase: Array = new Array();

        public function getList(): Array{
            return taggedSensorBase;
        }

}

}
