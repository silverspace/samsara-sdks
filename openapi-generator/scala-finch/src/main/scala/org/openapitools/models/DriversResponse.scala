package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Driver
import scala.collection.immutable.Seq

/**
 * 
 * @param drivers 
 */
case class DriversResponse(drivers: Option[Seq[Driver]]
                )

object DriversResponse {
    /**
     * Creates the codec for converting DriversResponse from and to JSON.
     */
    implicit val decoder: Decoder[DriversResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DriversResponse] = deriveEncoder
}
