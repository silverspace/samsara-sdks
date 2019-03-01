package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.HosAuthenticationLogsResponseAuthenticationLogs
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param authenticationLogs 
 */
data class HosAuthenticationLogsResponse (

        @JsonProperty("authenticationLogs") val authenticationLogs: List<HosAuthenticationLogsResponseAuthenticationLogs>? = null
) {

}

