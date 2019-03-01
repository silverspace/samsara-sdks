package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class JobStatusList implements ListWrapper {
        // This declaration below of _jobStatus_obj_class is to force flash compiler to include this class
        private var _jobStatus_obj_class: org.openapitools.client.model.JobStatus = null;
        [XmlElements(name="jobStatus", type="org.openapitools.client.model.JobStatus")]
        public var jobStatus: Array = new Array();

        public function getList(): Array{
            return jobStatus;
        }

}

}
