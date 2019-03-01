package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DispatchJobCreate
import org.openapitools.models.JobStatus

/**
 * 
 * @param destinationUnderscoreaddress The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
 * @param destinationUnderscoreaddressUnderscoreid ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
 * @param destinationUnderscorelat Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @param destinationUnderscorelng Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @param destinationUnderscorename The name of the job destination. If provided, it will take precedence over the name of the address book entry.
 * @param notes Notes regarding the details of this job.
 * @param scheduledUnderscorearrivalUnderscoretimeUnderscorems The time at which the assigned driver is scheduled to arrive at the job destination.
 * @param scheduledUnderscoredepartureUnderscoretimeUnderscorems The time at which the assigned driver is scheduled to depart from the job destination.
 * @param arrivedUnderscoreatUnderscorems The time at which the driver arrived at the job destination.
 * @param completedUnderscoreatUnderscorems The time at which the job was marked complete (e.g. started driving to the next destination).
 * @param dispatchUnderscorerouteUnderscoreid ID of the route that this job belongs to.
 * @param driverUnderscoreid ID of the driver assigned to the dispatch job.
 * @param enUnderscorerouteUnderscoreatUnderscorems The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
 * @param estimatedUnderscorearrivalUnderscorems The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
 * @param fleetUnderscoreviewerUnderscoreurl Fleet viewer url of the dispatch job.
 * @param groupUnderscoreid 
 * @param id ID of the Samsara dispatch job.
 * @param jobUnderscorestate 
 * @param skippedUnderscoreatUnderscorems The time at which the job was marked skipped.
 * @param vehicleUnderscoreid ID of the vehicle used for the dispatch job.
 */
case class DispatchJob(destinationUnderscoreaddress: Option[String],
                destinationUnderscoreaddressUnderscoreid: Option[Long],
                destinationUnderscorelat: Option[Double],
                destinationUnderscorelng: Option[Double],
                destinationUnderscorename: Option[String],
                notes: Option[String],
                scheduledUnderscorearrivalUnderscoretimeUnderscorems: Long,
                scheduledUnderscoredepartureUnderscoretimeUnderscorems: Option[Long],
                arrivedUnderscoreatUnderscorems: Option[Long],
                completedUnderscoreatUnderscorems: Option[Long],
                dispatchUnderscorerouteUnderscoreid: Long,
                driverUnderscoreid: Option[Long],
                enUnderscorerouteUnderscoreatUnderscorems: Option[Long],
                estimatedUnderscorearrivalUnderscorems: Option[Long],
                fleetUnderscoreviewerUnderscoreurl: Option[String],
                groupUnderscoreid: Long,
                id: Long,
                jobUnderscorestate: JobStatus,
                skippedUnderscoreatUnderscorems: Option[Long],
                vehicleUnderscoreid: Option[Long]
                )

object DispatchJob {
    /**
     * Creates the codec for converting DispatchJob from and to JSON.
     */
    implicit val decoder: Decoder[DispatchJob] = deriveDecoder
    implicit val encoder: ObjectEncoder[DispatchJob] = deriveEncoder
}
