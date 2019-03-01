package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AuxInputSeries._

case class AuxInputSeries (
  /* The name of the aux input. */
  name: Name,
values: List[AuxInput])

object AuxInputSeries {
  import DateTimeCodecs._
  sealed trait Name
  case object EmergencyLights extends Name
  case object EmergencyAlarm extends Name
  case object StopPaddle extends Name
  case object PowerTakeOff extends Name
  case object Plow extends Name
  case object Sweeper extends Name
  case object Salter extends Name
  case object Boom extends Name

  object Name {
    def toName(s: String): Option[Name] = s match {
      case "EmergencyLights" => Some(EmergencyLights)
      case "EmergencyAlarm" => Some(EmergencyAlarm)
      case "StopPaddle" => Some(StopPaddle)
      case "PowerTakeOff" => Some(PowerTakeOff)
      case "Plow" => Some(Plow)
      case "Sweeper" => Some(Sweeper)
      case "Salter" => Some(Salter)
      case "Boom" => Some(Boom)
      case _ => None
    }

    def fromName(x: Name): String = x match {
      case EmergencyLights => "EmergencyLights"
      case EmergencyAlarm => "EmergencyAlarm"
      case StopPaddle => "StopPaddle"
      case PowerTakeOff => "PowerTakeOff"
      case Plow => "Plow"
      case Sweeper => "Sweeper"
      case Salter => "Salter"
      case Boom => "Boom"
    }
  }

  implicit val NameEnumEncoder: EncodeJson[Name] =
    EncodeJson[Name](is => StringEncodeJson(Name.fromName(is)))

  implicit val NameEnumDecoder: DecodeJson[Name] =
    DecodeJson.optionDecoder[Name](n => n.string.flatMap(jStr => Name.toName(jStr)), "Name failed to de-serialize")

  implicit val AuxInputSeriesCodecJson: CodecJson[AuxInputSeries] = CodecJson.derive[AuxInputSeries]
  implicit val AuxInputSeriesDecoder: EntityDecoder[AuxInputSeries] = jsonOf[AuxInputSeries]
  implicit val AuxInputSeriesEncoder: EntityEncoder[AuxInputSeries] = jsonEncoderOf[AuxInputSeries]
}
