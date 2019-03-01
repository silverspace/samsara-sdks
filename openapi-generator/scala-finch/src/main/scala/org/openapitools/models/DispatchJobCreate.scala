package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

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
 */
case class DispatchJobCreate(destinationUnderscoreaddress: Option[String],
                destinationUnderscoreaddressUnderscoreid: Option[Long],
                destinationUnderscorelat: Option[Double],
                destinationUnderscorelng: Option[Double],
                destinationUnderscorename: Option[String],
                notes: Option[String],
                scheduledUnderscorearrivalUnderscoretimeUnderscorems: Long,
                scheduledUnderscoredepartureUnderscoretimeUnderscorems: Option[Long]
                )

object DispatchJobCreate {
    /**
     * Creates the codec for converting DispatchJobCreate from and to JSON.
     */
    implicit val decoder: Decoder[DispatchJobCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[DispatchJobCreate] = deriveEncoder
}
