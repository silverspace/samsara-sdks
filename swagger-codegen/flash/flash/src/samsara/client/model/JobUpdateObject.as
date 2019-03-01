package samsara.client.model {

import samsara.client.model.DispatchRoute;
import samsara.client.model.JobStatus;
import samsara.client.model.PrevJobStatus;

    [XmlRootNode(name="JobUpdateObject")]
    public class JobUpdateObject {
        /* Timestamp that this event was updated, represented as Unix milliseconds since epoch. */
        [XmlElement(name="changed_at_ms")]
        public var changedAtMs: Number = 0;
        /* ID of the Samsara job. */
        [XmlElement(name="job_id")]
        public var jobId: Number = 0;
                [XmlElement(name="job_state")]
        public var jobState: JobStatus = NaN;
                [XmlElement(name="prev_job_state")]
        public var prevJobState: PrevJobStatus = NaN;
                [XmlElement(name="route")]
        public var route: DispatchRoute = NaN;
        /* ID of the Samsara dispatch route. */
        [XmlElement(name="route_id")]
        public var routeId: Number = 0;

    public function toString(): String {
        var str: String = "JobUpdateObject: ";
        str += " (changedAtMs: " + changedAtMs + ")";
        str += " (jobId: " + jobId + ")";
        str += " (jobState: " + jobState + ")";
        str += " (prevJobState: " + prevJobState + ")";
        str += " (route: " + route + ")";
        str += " (routeId: " + routeId + ")";
        return str;
    }

}

}
