package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Contains the location and speed of a vehicle at a particular time
 * @param latitude The latitude of the location in degrees.
 * @param location The best effort (street,city,state) for the latitude and longitude.
 * @param longitude The longitude of the location in degrees.
 * @param speedMilesPerHour The speed calculated from GPS that the asset was traveling at in miles per hour.
 * @param timeMs Time in Unix milliseconds since epoch when the asset was at the location.
 */
case class FleetVehicleLocation(latitude: Option[Double],
                location: Option[String],
                longitude: Option[Double],
                speedMilesPerHour: Option[Double],
                timeMs: Option[Long]
                )

object FleetVehicleLocation {
    /**
     * Creates the codec for converting FleetVehicleLocation from and to JSON.
     */
    implicit val decoder: Decoder[FleetVehicleLocation] = deriveDecoder
    implicit val encoder: ObjectEncoder[FleetVehicleLocation] = deriveEncoder
}
