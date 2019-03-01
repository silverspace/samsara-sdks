package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TaggedMachineBase

/**
 * 
 * @param id The ID of the Machine being tagged.
 * @param name Name of the Machine being tagged.
 */
case class TaggedMachine(id: Long,
                name: Option[String]
                )

object TaggedMachine {
    /**
     * Creates the codec for converting TaggedMachine from and to JSON.
     */
    implicit val decoder: Decoder[TaggedMachine] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedMachine] = deriveEncoder
}
