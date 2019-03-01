package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param externalIds 
 * @param harshUnderscoreaccelUnderscoresetting Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
 * @param name Name
 */
case class InlineObject16(externalIds: Option[Map[String, String]],
                harshUnderscoreaccelUnderscoresetting: Option[Int],
                name: Option[String]
                )

object InlineObject16 {
    /**
     * Creates the codec for converting InlineObject16 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject16] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject16] = deriveEncoder
}
