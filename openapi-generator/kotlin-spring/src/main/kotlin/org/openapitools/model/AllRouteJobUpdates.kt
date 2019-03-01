package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.JobUpdateObject
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param jobUpdates 
 * @param sequenceId Sequence ID of the last update returned in the response
 */
data class AllRouteJobUpdates (

        @JsonProperty("job_updates") val jobUpdates: List<JobUpdateObject>? = null,

        @JsonProperty("sequence_id") val sequenceId: String? = null
) {

}

