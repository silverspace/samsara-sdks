package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.VehicleLocation
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param groupId Group ID to query.
 * @param vehicles 
 */
data class InlineResponse2003 (

        @JsonProperty("groupId") val groupId: Long? = null,

        @JsonProperty("vehicles") val vehicles: List<VehicleLocation>? = null
) {

}

