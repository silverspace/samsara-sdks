package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.InlineResponse2005VehicleStats
import org.openapitools.model.Pagination
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param pagination 
 * @param vehicleStats 
 */
data class InlineResponse2005 (

        @get:NotNull 
        @JsonProperty("vehicleStats") val vehicleStats: List<InlineResponse2005VehicleStats>,

        @JsonProperty("pagination") val pagination: Pagination? = null
) {

}

