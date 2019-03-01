package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TaggedVehicleBase
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of the Vehicle being tagged.
 * @param name Name of the Vehicle being tagged.
 */
data class TaggedVehicle (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("name") val name: String? = null
) {

}

