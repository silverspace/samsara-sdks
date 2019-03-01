package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Start (latitude, longitude) in decimal degrees.
 * @param latitude 
 * @param longitude 
 */
case class TripResponseStartCoordinates(latitude: Option[Double],
                longitude: Option[Double]
                )

object TripResponseStartCoordinates {
    /**
     * Creates the codec for converting TripResponseStartCoordinates from and to JSON.
     */
    implicit val decoder: Decoder[TripResponseStartCoordinates] = deriveDecoder
    implicit val encoder: ObjectEncoder[TripResponseStartCoordinates] = deriveEncoder
}
