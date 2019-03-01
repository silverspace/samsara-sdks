package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DispatchJobCreate;
import samsara.client.model.JobStatus;

    public class DispatchJobList implements ListWrapper {
        // This declaration below of _DispatchJob_obj_class is to force flash compiler to include this class
        private var _dispatchJob_obj_class: samsara.client.model.DispatchJob = null;
        [XmlElements(name="dispatchJob", type="samsara.client.model.DispatchJob")]
        public var dispatchJob: Array = new Array();

        public function getList(): Array{
            return dispatchJob;
        }

}

}
