package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * A vehicle object.
 * @param engineHours Total engine hours for the vehicle.
 * @param fuelLevelPercent The fuel level of the vehicle as a percentage. (0.0 to 1.0)
 * @param id ID of the vehicle.
 * @param name Name of the vehicle.
 * @param note 
 * @param odometerMeters The number of meters reported by the odometer.
 * @param vin Vehicle Identification Number.
 */
data class Vehicle (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("engineHours") val engineHours: Long? = null,

        @JsonProperty("fuelLevelPercent") val fuelLevelPercent: Double? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("note") val note: String? = null,

        @JsonProperty("odometerMeters") val odometerMeters: Long? = null,

        @JsonProperty("vin") val vin: String? = null
) {

}

