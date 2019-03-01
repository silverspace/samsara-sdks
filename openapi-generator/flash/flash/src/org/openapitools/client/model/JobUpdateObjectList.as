package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DispatchRoute;
import org.openapitools.client.model.JobStatus;
import org.openapitools.client.model.PrevJobStatus;

    public class JobUpdateObjectList implements ListWrapper {
        // This declaration below of _jobUpdateObject_obj_class is to force flash compiler to include this class
        private var _jobUpdateObject_obj_class: org.openapitools.client.model.JobUpdateObject = null;
        [XmlElements(name="jobUpdateObject", type="org.openapitools.client.model.JobUpdateObject")]
        public var jobUpdateObject: Array = new Array();

        public function getList(): Array{
            return jobUpdateObject;
        }

}

}
