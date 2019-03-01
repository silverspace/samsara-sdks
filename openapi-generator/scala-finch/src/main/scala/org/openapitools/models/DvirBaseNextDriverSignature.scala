package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The next driver signature for the DVIR.
 * @param driverId ID of the driver who signed the DVIR
 * @param name The name of the driver who signed the next DVIR on this vehicle.
 * @param signedAt The time in millis when the next driver signed the DVIR on this vehicle.
 * @param _type Type corresponds to driver.
 * @param email Email of the  driver who signed the next DVIR on this vehicle.
 * @param username Username of the  driver who signed the next DVIR on this vehicle.
 */
case class DvirBaseNextDriverSignature(driverId: Option[Long],
                name: Option[String],
                signedAt: Option[Long],
                _type: Option[String],
                email: Option[String],
                username: Option[String]
                )

object DvirBaseNextDriverSignature {
    /**
     * Creates the codec for converting DvirBaseNextDriverSignature from and to JSON.
     */
    implicit val decoder: Decoder[DvirBaseNextDriverSignature] = deriveDecoder
    implicit val encoder: ObjectEncoder[DvirBaseNextDriverSignature] = deriveEncoder
}
