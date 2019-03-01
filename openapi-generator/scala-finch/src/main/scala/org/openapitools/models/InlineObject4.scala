package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param reactivate True indicates that this driver should be reactivated.
 */
case class InlineObject4(reactivate: Boolean
                )

object InlineObject4 {
    /**
     * Creates the codec for converting InlineObject4 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject4] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject4] = deriveEncoder
}
