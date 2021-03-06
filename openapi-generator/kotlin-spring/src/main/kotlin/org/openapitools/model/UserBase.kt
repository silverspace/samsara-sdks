package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param authType The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
 * @param email The email address of this user.
 * @param name The first and last name of the user.
 * @param organizationRoleId The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
 */
data class UserBase (

        @get:NotNull 
        @JsonProperty("authType") val authType: UserBase.AuthType,

        @get:NotNull 
        @JsonProperty("email") val email: String,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("organizationRoleId") val organizationRoleId: String? = null
) {

    /**
    * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
    * Values: default,saml
    */
    enum class AuthType(val value: String) {
    
        @JsonProperty("default") default("default"),
    
        @JsonProperty("saml") saml("saml");
    
    }

}

