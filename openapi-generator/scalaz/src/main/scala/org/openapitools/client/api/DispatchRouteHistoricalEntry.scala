package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DispatchRouteHistoricalEntry._

case class DispatchRouteHistoricalEntry (
  /* Timestamp that the route was updated, represented as Unix milliseconds since epoch. */
  changedAtMs: Option[Long],
route: Option[DispatchRoute])

object DispatchRouteHistoricalEntry {
  import DateTimeCodecs._

  implicit val DispatchRouteHistoricalEntryCodecJson: CodecJson[DispatchRouteHistoricalEntry] = CodecJson.derive[DispatchRouteHistoricalEntry]
  implicit val DispatchRouteHistoricalEntryDecoder: EntityDecoder[DispatchRouteHistoricalEntry] = jsonOf[DispatchRouteHistoricalEntry]
  implicit val DispatchRouteHistoricalEntryEncoder: EntityEncoder[DispatchRouteHistoricalEntry] = jsonEncoderOf[DispatchRouteHistoricalEntry]
}
