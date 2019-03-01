package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import CurrentDriver._

case class CurrentDriver (
  
object CurrentDriver {
  import DateTimeCodecs._

  implicit val CurrentDriverCodecJson: CodecJson[CurrentDriver] = CodecJson.derive[CurrentDriver]
  implicit val CurrentDriverDecoder: EntityDecoder[CurrentDriver] = jsonOf[CurrentDriver]
  implicit val CurrentDriverEncoder: EntityEncoder[CurrentDriver] = jsonEncoderOf[CurrentDriver]
}
