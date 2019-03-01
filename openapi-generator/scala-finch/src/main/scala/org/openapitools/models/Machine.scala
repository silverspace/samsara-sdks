package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Contains information about a machine.
 * @param id ID of the machine.
 * @param name Name of the machine.
 * @param notes Notes about the machine
 */
case class Machine(id: Long,
                name: Option[String],
                notes: Option[String]
                )

object Machine {
    /**
     * Creates the codec for converting Machine from and to JSON.
     */
    implicit val decoder: Decoder[Machine] = deriveDecoder
    implicit val encoder: ObjectEncoder[Machine] = deriveEncoder
}
