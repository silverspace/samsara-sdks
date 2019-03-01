package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Pagination
import org.openapitools.model.Vehicle
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param pagination 
 * @param groupId Group ID to query.
 * @param vehicles 
 */
data class InlineResponse2002 (

        @JsonProperty("pagination") val pagination: Pagination? = null,

        @JsonProperty("groupId") val groupId: Long? = null,

        @JsonProperty("vehicles") val vehicles: List<Vehicle>? = null
) {

}

