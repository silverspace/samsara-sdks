package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TripResponseEndCoordinates
import org.openapitools.models.TripResponseStartCoordinates

/**
 * 
 * @param endOdometer Odometer reading at the end of the trip.
 * @param distanceMeters Length of the trip in meters.
 * @param endMs End of the trip in UNIX milliseconds.
 * @param startMs Beginning of the trip in UNIX milliseconds.
 * @param fuelConsumedMl Amount in milliliters of fuel consumed on this trip.
 * @param startAddress Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
 * @param startCoordinates 
 * @param endCoordinates 
 * @param startOdometer Odometer reading at the beginning of the trip.
 * @param driverId ID of the driver.
 * @param startLocation Geocoded street address of start (latitude, longitude) coordinates.
 * @param tollMeters Length in meters trip spent on toll roads.
 * @param endAddress Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
 * @param endLocation Geocoded street address of start (latitude, longitude) coordinates.
 */
case class TripResponseTrips(endOdometer: Option[Int],
                distanceMeters: Option[Int],
                endMs: Option[Int],
                startMs: Option[Int],
                fuelConsumedMl: Option[Int],
                startAddress: Option[String],
                startCoordinates: Option[TripResponseStartCoordinates],
                endCoordinates: Option[TripResponseEndCoordinates],
                startOdometer: Option[Int],
                driverId: Option[Int],
                startLocation: Option[String],
                tollMeters: Option[Int],
                endAddress: Option[String],
                endLocation: Option[String]
                )

object TripResponseTrips {
    /**
     * Creates the codec for converting TripResponseTrips from and to JSON.
     */
    implicit val decoder: Decoder[TripResponseTrips] = deriveDecoder
    implicit val encoder: ObjectEncoder[TripResponseTrips] = deriveEncoder
}
