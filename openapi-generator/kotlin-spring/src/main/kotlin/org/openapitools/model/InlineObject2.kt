package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param address The address of the entry to add, as it would be recognized if provided to maps.google.com.
 * @param groupId Group ID to query.
 * @param name Name of the location to add to the address book.
 * @param radius Radius in meters of the address (used for matching vehicle trip stops to this location).
 */
data class InlineObject2 (

        @get:NotNull 
        @JsonProperty("address") val address: String,

        @get:NotNull 
        @JsonProperty("groupId") val groupId: Long,

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @get:NotNull 
        @JsonProperty("radius") val radius: Int
) {

}

