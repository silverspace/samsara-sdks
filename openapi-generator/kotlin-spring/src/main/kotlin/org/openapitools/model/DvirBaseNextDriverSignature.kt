package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * The next driver signature for the DVIR.
 * @param driverId ID of the driver who signed the DVIR
 * @param name The name of the driver who signed the next DVIR on this vehicle.
 * @param signedAt The time in millis when the next driver signed the DVIR on this vehicle.
 * @param type Type corresponds to driver.
 * @param email Email of the  driver who signed the next DVIR on this vehicle.
 * @param username Username of the  driver who signed the next DVIR on this vehicle.
 */
data class DvirBaseNextDriverSignature (

        @JsonProperty("driverId") val driverId: Long? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("signedAt") val signedAt: Long? = null,

        @JsonProperty("type") val type: String? = null,

        @JsonProperty("email") val email: String? = null,

        @JsonProperty("username") val username: String? = null
) {

}

