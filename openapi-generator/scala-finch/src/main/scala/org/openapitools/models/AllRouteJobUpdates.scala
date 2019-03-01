package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.JobUpdateObject
import scala.collection.immutable.Seq

/**
 * 
 * @param jobUnderscoreupdates 
 * @param sequenceUnderscoreid Sequence ID of the last update returned in the response
 */
case class AllRouteJobUpdates(jobUnderscoreupdates: Option[Seq[JobUpdateObject]],
                sequenceUnderscoreid: Option[String]
                )

object AllRouteJobUpdates {
    /**
     * Creates the codec for converting AllRouteJobUpdates from and to JSON.
     */
    implicit val decoder: Decoder[AllRouteJobUpdates] = deriveDecoder
    implicit val encoder: ObjectEncoder[AllRouteJobUpdates] = deriveEncoder
}
