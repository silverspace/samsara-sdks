package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedMachineBase;

    public class TaggedMachineList implements ListWrapper {
        // This declaration below of _TaggedMachine_obj_class is to force flash compiler to include this class
        private var _taggedMachine_obj_class: samsara.client.model.TaggedMachine = null;
        [XmlElements(name="taggedMachine", type="samsara.client.model.TaggedMachine")]
        public var taggedMachine: Array = new Array();

        public function getList(): Array{
            return taggedMachine;
        }

}

}
