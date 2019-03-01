package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DispatchRoute
import org.openapitools.models.JobStatus
import org.openapitools.models.PrevJobStatus

/**
 * 
 * @param changedUnderscoreatUnderscorems Timestamp that this event was updated, represented as Unix milliseconds since epoch.
 * @param jobUnderscoreid ID of the Samsara job.
 * @param jobUnderscorestate 
 * @param prevUnderscorejobUnderscorestate 
 * @param route 
 * @param routeUnderscoreid ID of the Samsara dispatch route.
 */
case class JobUpdateObject(changedUnderscoreatUnderscorems: Option[Long],
                jobUnderscoreid: Option[Long],
                jobUnderscorestate: Option[JobStatus],
                prevUnderscorejobUnderscorestate: Option[PrevJobStatus],
                route: Option[DispatchRoute],
                routeUnderscoreid: Option[Long]
                )

object JobUpdateObject {
    /**
     * Creates the codec for converting JobUpdateObject from and to JSON.
     */
    implicit val decoder: Decoder[JobUpdateObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[JobUpdateObject] = deriveEncoder
}
