package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class JobStatusList implements ListWrapper {
        // This declaration below of _jobStatus_obj_class is to force flash compiler to include this class
        private var _jobStatus_obj_class: samsara.client.model.JobStatus = null;
        [XmlElements(name="jobStatus", type="samsara.client.model.JobStatus")]
        public var jobStatus: Array = new Array();

        public function getList(): Array{
            return jobStatus;
        }

}

}
