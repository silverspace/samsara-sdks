package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import JobStatus._

case class JobStatus (
  
object JobStatus {
  import DateTimeCodecs._

  implicit val JobStatusCodecJson: CodecJson[JobStatus] = CodecJson.derive[JobStatus]
  implicit val JobStatusDecoder: EntityDecoder[JobStatus] = jsonOf[JobStatus]
  implicit val JobStatusEncoder: EntityEncoder[JobStatus] = jsonEncoderOf[JobStatus]
}
