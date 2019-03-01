package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class MachineHistoryResponseVibrationsList implements ListWrapper {
        // This declaration below of _MachineHistoryResponse_vibrations_obj_class is to force flash compiler to include this class
        private var _machineHistoryResponseVibrations_obj_class: samsara.client.model.MachineHistoryResponseVibrations = null;
        [XmlElements(name="machineHistoryResponseVibrations", type="samsara.client.model.MachineHistoryResponseVibrations")]
        public var machineHistoryResponseVibrations: Array = new Array();

        public function getList(): Array{
            return machineHistoryResponseVibrations;
        }

}

}
