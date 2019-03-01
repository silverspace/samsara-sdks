package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VehicleMaintenance
import scala.collection.immutable.Seq

/**
 * 
 * @param vehicles 
 */
case class InlineResponse2004(vehicles: Option[Seq[VehicleMaintenance]]
                )

object InlineResponse2004 {
    /**
     * Creates the codec for converting InlineResponse2004 from and to JSON.
     */
    implicit val decoder: Decoder[InlineResponse2004] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineResponse2004] = deriveEncoder
}
