package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id 
 * @param name 
 */
data class UserRole (

        @JsonProperty("id") val id: String? = null,

        @JsonProperty("name") val name: String? = null
) {

}

