package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DispatchJob._

case class DispatchJob (
  /* The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. */
  destinationAddress: Option[String],
/* ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. */
  destinationAddressId: Option[Long],
/* Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
  destinationLat: Option[Double],
/* Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
  destinationLng: Option[Double],
/* The name of the job destination. If provided, it will take precedence over the name of the address book entry. */
  destinationName: Option[String],
/* Notes regarding the details of this job. */
  notes: Option[String],
/* The time at which the assigned driver is scheduled to arrive at the job destination. */
  scheduledArrivalTimeMs: Long,
/* The time at which the assigned driver is scheduled to depart from the job destination. */
  scheduledDepartureTimeMs: Option[Long],
/* The time at which the driver arrived at the job destination. */
  arrivedAtMs: Option[Long],
/* The time at which the job was marked complete (e.g. started driving to the next destination). */
  completedAtMs: Option[Long],
/* ID of the route that this job belongs to. */
  dispatchRouteId: Long,
/* ID of the driver assigned to the dispatch job. */
  driverId: Option[Long],
/* The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). */
  enRouteAtMs: Option[Long],
/* The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. */
  estimatedArrivalMs: Option[Long],
/* Fleet viewer url of the dispatch job. */
  fleetViewerUrl: Option[String],
groupId: Long,
/* ID of the Samsara dispatch job. */
  id: Long,
jobState: JobStatus,
/* The time at which the job was marked skipped. */
  skippedAtMs: Option[Long],
/* ID of the vehicle used for the dispatch job. */
  vehicleId: Option[Long])

object DispatchJob {
  import DateTimeCodecs._

  implicit val DispatchJobCodecJson: CodecJson[DispatchJob] = CodecJson.derive[DispatchJob]
  implicit val DispatchJobDecoder: EntityDecoder[DispatchJob] = jsonOf[DispatchJob]
  implicit val DispatchJobEncoder: EntityEncoder[DispatchJob] = jsonEncoderOf[DispatchJob]
}
