package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Driver
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param drivers 
 */
data class DriversResponse (

        @JsonProperty("drivers") val drivers: List<Driver>? = null
) {

}

