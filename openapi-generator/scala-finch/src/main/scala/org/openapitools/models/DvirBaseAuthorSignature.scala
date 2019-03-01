package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The authors signature for the DVIR.
 * @param mechanicUserId ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
 * @param driverId ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
 * @param name The name of the driver or mechanic who signed the DVIR.
 * @param signedAt The time in millis when the DVIR was signed
 * @param _type Type corresponds to whether the signature corresponds to driver|mechanic.
 * @param email Email of the  driver|mechanic who signed the DVIR.
 * @param username Username of the  driver|mechanic who signed the DVIR.
 */
case class DvirBaseAuthorSignature(mechanicUserId: Option[Long],
                driverId: Option[Long],
                name: Option[String],
                signedAt: Option[Long],
                _type: Option[String],
                email: Option[String],
                username: Option[String]
                )

object DvirBaseAuthorSignature {
    /**
     * Creates the codec for converting DvirBaseAuthorSignature from and to JSON.
     */
    implicit val decoder: Decoder[DvirBaseAuthorSignature] = deriveDecoder
    implicit val encoder: ObjectEncoder[DvirBaseAuthorSignature] = deriveEncoder
}
