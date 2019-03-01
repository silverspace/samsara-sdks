package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * The authors signature for the DVIR.
 * @param mechanicUserId ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
 * @param driverId ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
 * @param name The name of the driver or mechanic who signed the DVIR.
 * @param signedAt The time in millis when the DVIR was signed
 * @param type Type corresponds to whether the signature corresponds to driver|mechanic.
 * @param email Email of the  driver|mechanic who signed the DVIR.
 * @param username Username of the  driver|mechanic who signed the DVIR.
 */
data class DvirBaseAuthorSignature (

        @JsonProperty("mechanicUserId") val mechanicUserId: Long? = null,

        @JsonProperty("driverId") val driverId: Long? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("signedAt") val signedAt: Long? = null,

        @JsonProperty("type") val type: String? = null,

        @JsonProperty("email") val email: String? = null,

        @JsonProperty("username") val username: String? = null
) {

}

