package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InlineResponse2005VehicleStats
import org.openapitools.models.Pagination
import scala.collection.immutable.Seq

/**
 * 
 * @param pagination 
 * @param vehicleStats 
 */
case class InlineResponse2005(pagination: Option[Pagination],
                vehicleStats: Seq[InlineResponse2005VehicleStats]
                )

object InlineResponse2005 {
    /**
     * Creates the codec for converting InlineResponse2005 from and to JSON.
     */
    implicit val decoder: Decoder[InlineResponse2005] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineResponse2005] = deriveEncoder
}
