package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class MachineList implements ListWrapper {
        // This declaration below of _Machine_obj_class is to force flash compiler to include this class
        private var _machine_obj_class: org.openapitools.client.model.Machine = null;
        [XmlElements(name="machine", type="org.openapitools.client.model.Machine")]
        public var machine: Array = new Array();

        public function getList(): Array{
            return machine;
        }

}

}
