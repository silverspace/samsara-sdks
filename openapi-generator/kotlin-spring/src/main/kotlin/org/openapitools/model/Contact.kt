package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Information about a notification contact for alerts.
 * @param email Email address of the contact
 * @param firstName First name of the contact
 * @param id ID of the contact
 * @param lastName Last name of the contact
 * @param phone Phone number of the contact
 */
data class Contact (

        @JsonProperty("email") val email: String? = null,

        @JsonProperty("firstName") val firstName: String? = null,

        @JsonProperty("id") val id: Long? = null,

        @JsonProperty("lastName") val lastName: String? = null,

        @JsonProperty("phone") val phone: String? = null
) {

}

