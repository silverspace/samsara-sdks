package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DispatchJobCreate._

case class DispatchJobCreate (
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
  scheduledDepartureTimeMs: Option[Long])

object DispatchJobCreate {
  import DateTimeCodecs._

  implicit val DispatchJobCreateCodecJson: CodecJson[DispatchJobCreate] = CodecJson.derive[DispatchJobCreate]
  implicit val DispatchJobCreateDecoder: EntityDecoder[DispatchJobCreate] = jsonOf[DispatchJobCreate]
  implicit val DispatchJobCreateEncoder: EntityEncoder[DispatchJobCreate] = jsonEncoderOf[DispatchJobCreate]
}
