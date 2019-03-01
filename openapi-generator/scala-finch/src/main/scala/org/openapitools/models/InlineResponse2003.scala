package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VehicleLocation
import scala.collection.immutable.Seq

/**
 * 
 * @param groupId Group ID to query.
 * @param vehicles 
 */
case class InlineResponse2003(groupId: Option[Long],
                vehicles: Option[Seq[VehicleLocation]]
                )

object InlineResponse2003 {
    /**
     * Creates the codec for converting InlineResponse2003 from and to JSON.
     */
    implicit val decoder: Decoder[InlineResponse2003] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineResponse2003] = deriveEncoder
}
