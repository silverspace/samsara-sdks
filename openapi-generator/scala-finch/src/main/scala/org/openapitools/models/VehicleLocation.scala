package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Contains the location, in latitude and longitude, of a vehicle.
 * @param heading Heading in degrees.
 * @param id ID of the vehicle.
 * @param latitude Latitude in decimal degrees.
 * @param location Text representation of nearest identifiable location to (latitude, longitude) coordinates.
 * @param longitude Longitude in decimal degrees.
 * @param name Name of the vehicle.
 * @param odometerMeters The number of meters reported by the odometer.
 * @param onTrip Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
 * @param speed Speed in miles per hour.
 * @param time The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
 * @param vin Vehicle Identification Number (VIN) of the vehicle.
 */
case class VehicleLocation(heading: Option[Double],
                id: Long,
                latitude: Option[Double],
                location: Option[String],
                longitude: Option[Double],
                name: Option[String],
                odometerMeters: Option[Long],
                onTrip: Option[Boolean],
                speed: Option[Double],
                time: Option[Int],
                vin: Option[String]
                )

object VehicleLocation {
    /**
     * Creates the codec for converting VehicleLocation from and to JSON.
     */
    implicit val decoder: Decoder[VehicleLocation] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleLocation] = deriveEncoder
}
