package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DvirBase._

case class DvirBase (
  authorSignature: Option[DvirBaseAuthorSignature],
/* Signifies if the defects on the vehicle corrected after the DVIR is done. */
  defectsCorrected: Option[Boolean],
/* Signifies if the defects on this vehicle can be ignored. */
  defectsNeedNotBeCorrected: Option[Boolean],
/* The id of this DVIR record. */
  id: Option[Long],
/* Inspection type of the DVIR. */
  inspectionType: Option[String],
/* The mechanics notes on the DVIR. */
  mechanicNotes: Option[String],
mechanicOrAgentSignature: Option[DvirBaseMechanicOrAgentSignature],
nextDriverSignature: Option[DvirBaseNextDriverSignature],
/* The odometer reading in miles for the vehicle when the DVIR was done. */
  odometerMiles: Option[Long],
/* Timestamp of this DVIR in UNIX milliseconds. */
  timeMs: Option[Long],
/* Defects registered for the trailer which was part of the DVIR. */
  trailerDefects: Option[List[DvirBaseTrailerDefects]],
/* The id of the trailer which was part of the DVIR. */
  trailerId: Option[Integer],
/* The name of the trailer which was part of the DVIR. */
  trailerName: Option[String],
vehicle: Option[DvirBaseVehicle],
/* The condition of vechile on which DVIR was done. */
  vehicleCondition: Option[String],
/* Defects registered for the vehicle which was part of the DVIR. */
  vehicleDefects: Option[List[DvirBaseTrailerDefects]])

object DvirBase {
  import DateTimeCodecs._

  implicit val DvirBaseCodecJson: CodecJson[DvirBase] = CodecJson.derive[DvirBase]
  implicit val DvirBaseDecoder: EntityDecoder[DvirBase] = jsonOf[DvirBase]
  implicit val DvirBaseEncoder: EntityEncoder[DvirBase] = jsonEncoderOf[DvirBase]
}
