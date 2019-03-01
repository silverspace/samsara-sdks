package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.MachineHistoryResponseMachines;

    public class MachineHistoryResponseList implements ListWrapper {
        // This declaration below of _MachineHistoryResponse_obj_class is to force flash compiler to include this class
        private var _machineHistoryResponse_obj_class: org.openapitools.client.model.MachineHistoryResponse = null;
        [XmlElements(name="machineHistoryResponse", type="org.openapitools.client.model.MachineHistoryResponse")]
        public var machineHistoryResponse: Array = new Array();

        public function getList(): Array{
            return machineHistoryResponse;
        }

}

}
