package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TaggedSensorBaseList implements ListWrapper {
        // This declaration below of _TaggedSensorBase_obj_class is to force flash compiler to include this class
        private var _taggedSensorBase_obj_class: org.openapitools.client.model.TaggedSensorBase = null;
        [XmlElements(name="taggedSensorBase", type="org.openapitools.client.model.TaggedSensorBase")]
        public var taggedSensorBase: Array = new Array();

        public function getList(): Array{
            return taggedSensorBase;
        }

}

}
