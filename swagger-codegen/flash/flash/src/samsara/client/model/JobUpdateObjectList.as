package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DispatchRoute;
import samsara.client.model.JobStatus;
import samsara.client.model.PrevJobStatus;

    public class JobUpdateObjectList implements ListWrapper {
        // This declaration below of _jobUpdateObject_obj_class is to force flash compiler to include this class
        private var _jobUpdateObject_obj_class: samsara.client.model.JobUpdateObject = null;
        [XmlElements(name="jobUpdateObject", type="samsara.client.model.JobUpdateObject")]
        public var jobUpdateObject: Array = new Array();

        public function getList(): Array{
            return jobUpdateObject;
        }

}

}
