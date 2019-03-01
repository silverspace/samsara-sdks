package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DispatchRoute
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param changedAtMs Timestamp that the route was updated, represented as Unix milliseconds since epoch.
 * @param route 
 */
data class DispatchRouteHistoricalEntry (

        @JsonProperty("changed_at_ms") val changedAtMs: Long? = null,

        @JsonProperty("route") val route: DispatchRoute? = null
) {

}

