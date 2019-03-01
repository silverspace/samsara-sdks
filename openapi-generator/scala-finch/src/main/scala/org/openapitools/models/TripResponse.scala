package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TripResponseTrips
import scala.collection.immutable.Seq

/**
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 * @param trips 
 */
case class TripResponse(trips: Option[Seq[TripResponseTrips]]
                )

object TripResponse {
    /**
     * Creates the codec for converting TripResponse from and to JSON.
     */
    implicit val decoder: Decoder[TripResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[TripResponse] = deriveEncoder
}
