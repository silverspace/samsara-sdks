package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TaggedMachineBaseList implements ListWrapper {
        // This declaration below of _TaggedMachineBase_obj_class is to force flash compiler to include this class
        private var _taggedMachineBase_obj_class: org.openapitools.client.model.TaggedMachineBase = null;
        [XmlElements(name="taggedMachineBase", type="org.openapitools.client.model.TaggedMachineBase")]
        public var taggedMachineBase: Array = new Array();

        public function getList(): Array{
            return taggedMachineBase;
        }

}

}
