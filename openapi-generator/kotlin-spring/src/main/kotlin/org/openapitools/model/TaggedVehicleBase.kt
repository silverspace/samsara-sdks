package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of the Vehicle being tagged.
 */
data class TaggedVehicleBase (

        @get:NotNull 
        @JsonProperty("id") val id: Long
) {

}

