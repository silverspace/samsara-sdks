package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DispatchRouteHistoricalEntry
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param history History of the route's state changes.
 */
data class DispatchRouteHistory (

        @JsonProperty("history") val history: List<DispatchRouteHistoricalEntry>? = null
) {

}

