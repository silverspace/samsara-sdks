package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.HosLogsSummaryResponseDrivers
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param drivers 
 */
data class HosLogsSummaryResponse (

        @JsonProperty("drivers") val drivers: List<HosLogsSummaryResponseDrivers>? = null
) {

}

