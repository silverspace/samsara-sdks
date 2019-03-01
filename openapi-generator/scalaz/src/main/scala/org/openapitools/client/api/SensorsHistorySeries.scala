package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SensorsHistorySeries._

case class SensorsHistorySeries (
  /* Field to query. */
  field: Field,
/* Sensor ID to query. */
  widgetId: Long)

object SensorsHistorySeries {
  import DateTimeCodecs._
  sealed trait Field
  case object AmbientTemperature extends Field
  case object ProbeTemperature extends Field
  case object CurrentLoop1Raw extends Field
  case object CurrentLoop1Mapped extends Field
  case object CurrentLoop2Raw extends Field
  case object CurrentLoop2Mapped extends Field
  case object PmPowerTotal extends Field
  case object PmPhase1Power extends Field
  case object PmPhase2Power extends Field
  case object PmPhase3Power extends Field
  case object PmPhase1PowerFactor extends Field
  case object PmPhase2PowerFactor extends Field
  case object PmPhase3PowerFactor extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "AmbientTemperature" => Some(AmbientTemperature)
      case "ProbeTemperature" => Some(ProbeTemperature)
      case "CurrentLoop1Raw" => Some(CurrentLoop1Raw)
      case "CurrentLoop1Mapped" => Some(CurrentLoop1Mapped)
      case "CurrentLoop2Raw" => Some(CurrentLoop2Raw)
      case "CurrentLoop2Mapped" => Some(CurrentLoop2Mapped)
      case "PmPowerTotal" => Some(PmPowerTotal)
      case "PmPhase1Power" => Some(PmPhase1Power)
      case "PmPhase2Power" => Some(PmPhase2Power)
      case "PmPhase3Power" => Some(PmPhase3Power)
      case "PmPhase1PowerFactor" => Some(PmPhase1PowerFactor)
      case "PmPhase2PowerFactor" => Some(PmPhase2PowerFactor)
      case "PmPhase3PowerFactor" => Some(PmPhase3PowerFactor)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case AmbientTemperature => "AmbientTemperature"
      case ProbeTemperature => "ProbeTemperature"
      case CurrentLoop1Raw => "CurrentLoop1Raw"
      case CurrentLoop1Mapped => "CurrentLoop1Mapped"
      case CurrentLoop2Raw => "CurrentLoop2Raw"
      case CurrentLoop2Mapped => "CurrentLoop2Mapped"
      case PmPowerTotal => "PmPowerTotal"
      case PmPhase1Power => "PmPhase1Power"
      case PmPhase2Power => "PmPhase2Power"
      case PmPhase3Power => "PmPhase3Power"
      case PmPhase1PowerFactor => "PmPhase1PowerFactor"
      case PmPhase2PowerFactor => "PmPhase2PowerFactor"
      case PmPhase3PowerFactor => "PmPhase3PowerFactor"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val SensorsHistorySeriesCodecJson: CodecJson[SensorsHistorySeries] = CodecJson.derive[SensorsHistorySeries]
  implicit val SensorsHistorySeriesDecoder: EntityDecoder[SensorsHistorySeries] = jsonOf[SensorsHistorySeries]
  implicit val SensorsHistorySeriesEncoder: EntityEncoder[SensorsHistorySeries] = jsonEncoderOf[SensorsHistorySeries]
}
