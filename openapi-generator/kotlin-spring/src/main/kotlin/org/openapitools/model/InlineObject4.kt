package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param reactivate True indicates that this driver should be reactivated.
 */
data class InlineObject4 (

        @get:NotNull 
        @JsonProperty("reactivate") val reactivate: Boolean
) {

}

