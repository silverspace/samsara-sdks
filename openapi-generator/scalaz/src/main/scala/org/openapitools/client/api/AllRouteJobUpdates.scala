package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AllRouteJobUpdates._

case class AllRouteJobUpdates (
  jobUpdates: Option[List[JobUpdateObject]],
/* Sequence ID of the last update returned in the response */
  sequenceId: Option[String])

object AllRouteJobUpdates {
  import DateTimeCodecs._

  implicit val AllRouteJobUpdatesCodecJson: CodecJson[AllRouteJobUpdates] = CodecJson.derive[AllRouteJobUpdates]
  implicit val AllRouteJobUpdatesDecoder: EntityDecoder[AllRouteJobUpdates] = jsonOf[AllRouteJobUpdates]
  implicit val AllRouteJobUpdatesEncoder: EntityEncoder[AllRouteJobUpdates] = jsonEncoderOf[AllRouteJobUpdates]
}
