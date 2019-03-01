package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VehicleHarshEventResponseLocation

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
case class VehicleHarshEventResponse(downloadForwardVideoUrl: Option[String],
                downloadInwardVideoUrl: Option[String],
                downloadTrackedInwardVideoUrl: Option[String],
                harshEventType: String,
                incidentReportUrl: String,
                isDistracted: Option[Boolean],
                location: Option[VehicleHarshEventResponseLocation]
                )

object VehicleHarshEventResponse {
    /**
     * Creates the codec for converting VehicleHarshEventResponse from and to JSON.
     */
    implicit val decoder: Decoder[VehicleHarshEventResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleHarshEventResponse] = deriveEncoder
}
