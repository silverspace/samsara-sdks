package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DriversSummaryResponseSummaries
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param summaries 
 */
data class DriversSummaryResponse (

        @JsonProperty("Summaries") val summaries: List<DriversSummaryResponseSummaries>? = null
) {

}

