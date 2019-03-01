package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.MachineHistoryResponseVibrations;

    public class MachineHistoryResponseMachinesList implements ListWrapper {
        // This declaration below of _MachineHistoryResponse_machines_obj_class is to force flash compiler to include this class
        private var _machineHistoryResponseMachines_obj_class: samsara.client.model.MachineHistoryResponseMachines = null;
        [XmlElements(name="machineHistoryResponseMachines", type="samsara.client.model.MachineHistoryResponseMachines")]
        public var machineHistoryResponseMachines: Array = new Array();

        public function getList(): Array{
            return machineHistoryResponseMachines;
        }

}

}
