package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DispatchRoute
import org.openapitools.model.JobStatus
import org.openapitools.model.PrevJobStatus
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param changedAtMs Timestamp that this event was updated, represented as Unix milliseconds since epoch.
 * @param jobId ID of the Samsara job.
 * @param jobState 
 * @param prevJobState 
 * @param route 
 * @param routeId ID of the Samsara dispatch route.
 */
data class JobUpdateObject (

        @JsonProperty("changed_at_ms") val changedAtMs: Long? = null,

        @JsonProperty("job_id") val jobId: Long? = null,

        @JsonProperty("job_state") val jobState: JobStatus? = null,

        @JsonProperty("prev_job_state") val prevJobState: PrevJobStatus? = null,

        @JsonProperty("route") val route: DispatchRoute? = null,

        @JsonProperty("route_id") val routeId: Long? = null
) {

}

