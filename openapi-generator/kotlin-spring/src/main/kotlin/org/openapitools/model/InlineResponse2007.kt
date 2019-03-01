package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Machine
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param machines 
 */
data class InlineResponse2007 (

        @JsonProperty("machines") val machines: List<Machine>? = null
) {

}

