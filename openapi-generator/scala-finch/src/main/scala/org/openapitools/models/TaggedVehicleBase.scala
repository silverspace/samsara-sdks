package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id The ID of the Vehicle being tagged.
 */
case class TaggedVehicleBase(id: Long
                )

object TaggedVehicleBase {
    /**
     * Creates the codec for converting TaggedVehicleBase from and to JSON.
     */
    implicit val decoder: Decoder[TaggedVehicleBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedVehicleBase] = deriveEncoder
}
