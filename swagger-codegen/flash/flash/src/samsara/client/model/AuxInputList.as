package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AuxInputList implements ListWrapper {
        // This declaration below of _AuxInput_obj_class is to force flash compiler to include this class
        private var _auxInput_obj_class: samsara.client.model.AuxInput = null;
        [XmlElements(name="auxInput", type="samsara.client.model.AuxInput")]
        public var auxInput: Array = new Array();

        public function getList(): Array{
            return auxInput;
        }

}

}
