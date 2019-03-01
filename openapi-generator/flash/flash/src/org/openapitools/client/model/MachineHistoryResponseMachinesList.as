package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.MachineHistoryResponseVibrations;

    public class MachineHistoryResponseMachinesList implements ListWrapper {
        // This declaration below of _MachineHistoryResponse_machines_obj_class is to force flash compiler to include this class
        private var _machineHistoryResponseMachines_obj_class: org.openapitools.client.model.MachineHistoryResponseMachines = null;
        [XmlElements(name="machineHistoryResponseMachines", type="org.openapitools.client.model.MachineHistoryResponseMachines")]
        public var machineHistoryResponseMachines: Array = new Array();

        public function getList(): Array{
            return machineHistoryResponseMachines;
        }

}

}
