package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject12._

case class InlineObject12 (
  /* Only type 'mechanic' is currently accepted. */
  inspectionType: InspectionType,
/* Any notes from the mechanic. */
  mechanicNotes: Option[String],
/* The current odometer of the vehicle. */
  odometerMiles: Option[Integer],
/* Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
  previousDefectsCorrected: Option[Boolean],
/* Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
  previousDefectsIgnored: Option[Boolean],
/* Whether or not this vehicle or trailer is safe to drive. */
  safe: Safe,
/* Id of trailer being inspected. Either vehicleId or trailerId must be provided. */
  trailerId: Option[Integer],
/* The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email. */
  userEmail: String,
/* Id of vehicle being inspected. Either vehicleId or trailerId must be provided. */
  vehicleId: Option[Integer])

object InlineObject12 {
  import DateTimeCodecs._
  sealed trait InspectionType
  case object Mechanic extends InspectionType

  object InspectionType {
    def toInspectionType(s: String): Option[InspectionType] = s match {
      case "Mechanic" => Some(Mechanic)
      case _ => None
    }

    def fromInspectionType(x: InspectionType): String = x match {
      case Mechanic => "Mechanic"
    }
  }

  implicit val InspectionTypeEnumEncoder: EncodeJson[InspectionType] =
    EncodeJson[InspectionType](is => StringEncodeJson(InspectionType.fromInspectionType(is)))

  implicit val InspectionTypeEnumDecoder: DecodeJson[InspectionType] =
    DecodeJson.optionDecoder[InspectionType](n => n.string.flatMap(jStr => InspectionType.toInspectionType(jStr)), "InspectionType failed to de-serialize")
  sealed trait Safe
  case object Safe extends Safe
  case object Unsafe extends Safe

  object Safe {
    def toSafe(s: String): Option[Safe] = s match {
      case "Safe" => Some(Safe)
      case "Unsafe" => Some(Unsafe)
      case _ => None
    }

    def fromSafe(x: Safe): String = x match {
      case Safe => "Safe"
      case Unsafe => "Unsafe"
    }
  }

  implicit val SafeEnumEncoder: EncodeJson[Safe] =
    EncodeJson[Safe](is => StringEncodeJson(Safe.fromSafe(is)))

  implicit val SafeEnumDecoder: DecodeJson[Safe] =
    DecodeJson.optionDecoder[Safe](n => n.string.flatMap(jStr => Safe.toSafe(jStr)), "Safe failed to de-serialize")

  implicit val InlineObject12CodecJson: CodecJson[InlineObject12] = CodecJson.derive[InlineObject12]
  implicit val InlineObject12Decoder: EntityDecoder[InlineObject12] = jsonOf[InlineObject12]
  implicit val InlineObject12Encoder: EntityEncoder[InlineObject12] = jsonEncoderOf[InlineObject12]
}
