package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Vehicle
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param groupId Group ID to query.
 * @param vehicles 
 */
data class InlineObject14 (

        @get:NotNull 
        @JsonProperty("groupId") val groupId: Long,

        @get:NotNull 
        @JsonProperty("vehicles") val vehicles: List<Vehicle>
) {

}

