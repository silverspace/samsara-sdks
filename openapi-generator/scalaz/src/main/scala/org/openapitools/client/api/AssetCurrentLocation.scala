package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetCurrentLocation._

case class AssetCurrentLocation (
  /* The latitude of the location in degrees. */
  latitude: Option[Double],
/* The best effort (street,city,state) for the latitude and longitude. */
  location: Option[String],
/* The longitude of the location in degrees. */
  longitude: Option[Double],
/* The speed calculated from GPS that the asset was traveling at in miles per hour. */
  speedMilesPerHour: Option[Double],
/* Time in Unix milliseconds since epoch when the asset was at the location. */
  timeMs: Option[Long])

object AssetCurrentLocation {
  import DateTimeCodecs._

  implicit val AssetCurrentLocationCodecJson: CodecJson[AssetCurrentLocation] = CodecJson.derive[AssetCurrentLocation]
  implicit val AssetCurrentLocationDecoder: EntityDecoder[AssetCurrentLocation] = jsonOf[AssetCurrentLocation]
  implicit val AssetCurrentLocationEncoder: EntityEncoder[AssetCurrentLocation] = jsonEncoderOf[AssetCurrentLocation]
}
