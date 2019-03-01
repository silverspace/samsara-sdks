package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DispatchRoute

/**
 * 
 * @param changedUnderscoreatUnderscorems Timestamp that the route was updated, represented as Unix milliseconds since epoch.
 * @param route 
 */
case class DispatchRouteHistoricalEntry(changedUnderscoreatUnderscorems: Option[Long],
                route: Option[DispatchRoute]
                )

object DispatchRouteHistoricalEntry {
    /**
     * Creates the codec for converting DispatchRouteHistoricalEntry from and to JSON.
     */
    implicit val decoder: Decoder[DispatchRouteHistoricalEntry] = deriveDecoder
    implicit val encoder: ObjectEncoder[DispatchRouteHistoricalEntry] = deriveEncoder
}
