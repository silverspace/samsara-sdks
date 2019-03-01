package org.openapitools.client.model {

import org.openapitools.client.model.JobUpdateObject;

    [XmlRootNode(name="AllRouteJobUpdates")]
    public class AllRouteJobUpdates {
                // This declaration below of _jobUpdates_obj_class is to force flash compiler to include this class
        private var _jobUpdates_obj_class: Array = null;
        [XmlElementWrapper(name="job_updates")]
        [XmlElements(name="jobUpdates", type="Array")]
                public var jobUpdates: Array = new Array();
        /* Sequence ID of the last update returned in the response */
        [XmlElement(name="sequence_id")]
        public var sequenceId: String = null;

    public function toString(): String {
        var str: String = "AllRouteJobUpdates: ";
        str += " (jobUpdates: " + jobUpdates + ")";
        str += " (sequenceId: " + sequenceId + ")";
        return str;
    }

}

}
