package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TaggedVehicleBase

/**
 * 
 * @param id The ID of the Vehicle being tagged.
 * @param name Name of the Vehicle being tagged.
 */
case class TaggedVehicle(id: Long,
                name: Option[String]
                )

object TaggedVehicle {
    /**
     * Creates the codec for converting TaggedVehicle from and to JSON.
     */
    implicit val decoder: Decoder[TaggedVehicle] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedVehicle] = deriveEncoder
}
