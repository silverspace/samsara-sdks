package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.FleetVehicleResponseVehicleInfo
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * A vehicle object as returned for fleet/vehicle
 * @param externalIds 
 * @param harshAccelSetting Harsh event detection setting.
 * @param id ID of the vehicle.
 * @param name Name of the vehicle.
 * @param vehicleInfo 
 */
data class FleetVehicleResponse (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @JsonProperty("externalIds") val externalIds: Map<kotlin.String, String>? = null,

        @JsonProperty("harshAccelSetting") val harshAccelSetting: String? = null,

        @JsonProperty("vehicleInfo") val vehicleInfo: FleetVehicleResponseVehicleInfo? = null
) {

}

