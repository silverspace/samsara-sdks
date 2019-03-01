package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.HosLogsResponseLogs
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param logs 
 */
data class HosLogsResponse (

        @JsonProperty("logs") val logs: List<HosLogsResponseLogs>? = null
) {

}

