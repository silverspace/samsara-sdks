package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import JobUpdateObject._

case class JobUpdateObject (
  /* Timestamp that this event was updated, represented as Unix milliseconds since epoch. */
  changedAtMs: Option[Long],
/* ID of the Samsara job. */
  jobId: Option[Long],
jobState: Option[JobStatus],
prevJobState: Option[PrevJobStatus],
route: Option[DispatchRoute],
/* ID of the Samsara dispatch route. */
  routeId: Option[Long])

object JobUpdateObject {
  import DateTimeCodecs._

  implicit val JobUpdateObjectCodecJson: CodecJson[JobUpdateObject] = CodecJson.derive[JobUpdateObject]
  implicit val JobUpdateObjectDecoder: EntityDecoder[JobUpdateObject] = jsonOf[JobUpdateObject]
  implicit val JobUpdateObjectEncoder: EntityEncoder[JobUpdateObject] = jsonEncoderOf[JobUpdateObject]
}
