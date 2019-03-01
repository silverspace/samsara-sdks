package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import PrevJobStatus._

case class PrevJobStatus (
  
object PrevJobStatus {
  import DateTimeCodecs._

  implicit val PrevJobStatusCodecJson: CodecJson[PrevJobStatus] = CodecJson.derive[PrevJobStatus]
  implicit val PrevJobStatusDecoder: EntityDecoder[PrevJobStatus] = jsonOf[PrevJobStatus]
  implicit val PrevJobStatusEncoder: EntityEncoder[PrevJobStatus] = jsonEncoderOf[PrevJobStatus]
}
