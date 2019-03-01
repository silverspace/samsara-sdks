package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DispatchRouteHistory._

case class DispatchRouteHistory (
  /* History of the route's state changes. */
  history: Option[List[DispatchRouteHistoricalEntry]])

object DispatchRouteHistory {
  import DateTimeCodecs._

  implicit val DispatchRouteHistoryCodecJson: CodecJson[DispatchRouteHistory] = CodecJson.derive[DispatchRouteHistory]
  implicit val DispatchRouteHistoryDecoder: EntityDecoder[DispatchRouteHistory] = jsonOf[DispatchRouteHistory]
  implicit val DispatchRouteHistoryEncoder: EntityEncoder[DispatchRouteHistory] = jsonEncoderOf[DispatchRouteHistory]
}
