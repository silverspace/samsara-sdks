package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DispatchJobCreate;
import org.openapitools.client.model.JobStatus;

    public class DispatchJobList implements ListWrapper {
        // This declaration below of _DispatchJob_obj_class is to force flash compiler to include this class
        private var _dispatchJob_obj_class: org.openapitools.client.model.DispatchJob = null;
        [XmlElements(name="dispatchJob", type="org.openapitools.client.model.DispatchJob")]
        public var dispatchJob: Array = new Array();

        public function getList(): Array{
            return dispatchJob;
        }

}

}
