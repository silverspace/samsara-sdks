package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param externalIds 
 * @param harshAccelSetting Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
 * @param name Name
 */
data class InlineObject16 (

        @JsonProperty("externalIds") val externalIds: Map<kotlin.String, String>? = null,

        @JsonProperty("harsh_accel_setting") val harshAccelSetting: Int? = null,

        @JsonProperty("name") val name: String? = null
) {

}

