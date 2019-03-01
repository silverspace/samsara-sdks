package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * End (latitude, longitude) in decimal degrees.
 * @param latitude 
 * @param longitude 
 */
case class TripResponseEndCoordinates(latitude: Option[Double],
                longitude: Option[Double]
                )

object TripResponseEndCoordinates {
    /**
     * Creates the codec for converting TripResponseEndCoordinates from and to JSON.
     */
    implicit val decoder: Decoder[TripResponseEndCoordinates] = deriveDecoder
    implicit val encoder: ObjectEncoder[TripResponseEndCoordinates] = deriveEncoder
}
