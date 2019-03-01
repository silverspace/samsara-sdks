package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.VehicleHarshEventResponseLocation
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Harsh event details for a vehicle
 * @param downloadForwardVideoUrl URL for downloading the forward facing video
 * @param downloadInwardVideoUrl URL for downloading the inward facing video
 * @param downloadTrackedInwardVideoUrl URL for downloading the tracked inward facing video
 * @param harshEventType Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
 * @param incidentReportUrl URL of the associated incident report page
 * @param isDistracted Whether the driver was deemed distracted during this harsh event
 * @param location 
 */
data class VehicleHarshEventResponse (

        @get:NotNull 
        @JsonProperty("harshEventType") val harshEventType: String,

        @get:NotNull 
        @JsonProperty("incidentReportUrl") val incidentReportUrl: String,

        @JsonProperty("downloadForwardVideoUrl") val downloadForwardVideoUrl: String? = null,

        @JsonProperty("downloadInwardVideoUrl") val downloadInwardVideoUrl: String? = null,

        @JsonProperty("downloadTrackedInwardVideoUrl") val downloadTrackedInwardVideoUrl: String? = null,

        @JsonProperty("isDistracted") val isDistracted: Boolean? = null,

        @JsonProperty("location") val location: VehicleHarshEventResponseLocation? = null
) {

}

