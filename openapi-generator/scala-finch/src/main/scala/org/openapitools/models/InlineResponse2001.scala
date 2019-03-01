package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetCurrentLocationsResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param assets 
 */
case class InlineResponse2001(assets: Option[Seq[AssetCurrentLocationsResponse]]
                )

object InlineResponse2001 {
    /**
     * Creates the codec for converting InlineResponse2001 from and to JSON.
     */
    implicit val decoder: Decoder[InlineResponse2001] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineResponse2001] = deriveEncoder
}
