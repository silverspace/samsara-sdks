package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DispatchRouteHistoricalEntry
import scala.collection.immutable.Seq

/**
 * 
 * @param history History of the route's state changes.
 */
case class DispatchRouteHistory(history: Option[Seq[DispatchRouteHistoricalEntry]]
                )

object DispatchRouteHistory {
    /**
     * Creates the codec for converting DispatchRouteHistory from and to JSON.
     */
    implicit val decoder: Decoder[DispatchRouteHistory] = deriveDecoder
    implicit val encoder: ObjectEncoder[DispatchRouteHistory] = deriveEncoder
}
