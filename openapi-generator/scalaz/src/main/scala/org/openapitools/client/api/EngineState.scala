package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import EngineState._

case class EngineState (
  /* Timestamp in Unix epoch milliseconds. */
  timeMs: Any,
value: Value)

object EngineState {
  import DateTimeCodecs._
  sealed trait Value
  case object Running extends Value
  case object Off extends Value
  case object Idle extends Value

  object Value {
    def toValue(s: String): Option[Value] = s match {
      case "Running" => Some(Running)
      case "Off" => Some(Off)
      case "Idle" => Some(Idle)
      case _ => None
    }

    def fromValue(x: Value): String = x match {
      case Running => "Running"
      case Off => "Off"
      case Idle => "Idle"
    }
  }

  implicit val ValueEnumEncoder: EncodeJson[Value] =
    EncodeJson[Value](is => StringEncodeJson(Value.fromValue(is)))

  implicit val ValueEnumDecoder: DecodeJson[Value] =
    DecodeJson.optionDecoder[Value](n => n.string.flatMap(jStr => Value.toValue(jStr)), "Value failed to de-serialize")

  implicit val EngineStateCodecJson: CodecJson[EngineState] = CodecJson.derive[EngineState]
  implicit val EngineStateDecoder: EntityDecoder[EngineState] = jsonOf[EngineState]
  implicit val EngineStateEncoder: EntityEncoder[EngineState] = jsonEncoderOf[EngineState]
}
