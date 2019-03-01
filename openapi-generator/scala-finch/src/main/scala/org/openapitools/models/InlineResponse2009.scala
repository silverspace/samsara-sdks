package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Tag
import scala.collection.immutable.Seq

/**
 * 
 * @param tags 
 */
case class InlineResponse2009(tags: Option[Seq[Tag]]
                )

object InlineResponse2009 {
    /**
     * Creates the codec for converting InlineResponse2009 from and to JSON.
     */
    implicit val decoder: Decoder[InlineResponse2009] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineResponse2009] = deriveEncoder
}
