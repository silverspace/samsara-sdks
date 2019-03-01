package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id The ID of the Machine being tagged.
 */
case class TaggedMachineBase(id: Long
                )

object TaggedMachineBase {
    /**
     * Creates the codec for converting TaggedMachineBase from and to JSON.
     */
    implicit val decoder: Decoder[TaggedMachineBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedMachineBase] = deriveEncoder
}
