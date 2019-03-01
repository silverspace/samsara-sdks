package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * The vehicle on which DVIR was done.
 * @param name The vehicle on which DVIR was done.
 * @param id The vehicle id on which DVIR was done.
 */
data class DvirBaseVehicle (

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("id") val id: Long? = null
) {

}

