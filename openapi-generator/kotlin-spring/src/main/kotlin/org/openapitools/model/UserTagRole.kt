package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.UserTagRoleTag
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param role The name of the role the user has been granted on this tag.
 * @param roleId The id of the role the user has been granted on this tag.
 * @param tag 
 */
data class UserTagRole (

        @get:NotNull 
        @JsonProperty("roleId") val roleId: String,

        @get:NotNull 
        @JsonProperty("tag") val tag: UserTagRoleTag,

        @JsonProperty("role") val role: String? = null
) {

}

