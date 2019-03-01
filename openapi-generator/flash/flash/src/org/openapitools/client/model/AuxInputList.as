package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Object;

    public class AuxInputList implements ListWrapper {
        // This declaration below of _AuxInput_obj_class is to force flash compiler to include this class
        private var _auxInput_obj_class: org.openapitools.client.model.AuxInput = null;
        [XmlElements(name="auxInput", type="org.openapitools.client.model.AuxInput")]
        public var auxInput: Array = new Array();

        public function getList(): Array{
            return auxInput;
        }

}

}
