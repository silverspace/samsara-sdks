package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetCurrentLocationsResponse._

case class AssetCurrentLocationsResponse (
  /* The cable connected to the asset */
  cable: Option[List[AssetCable]],
/* Engine hours */
  engineHours: Option[Integer],
/* Asset ID */
  id: Long,
/* Current location of an asset */
  location: Option[List[AssetCurrentLocation]],
/* Asset name */
  name: Option[String])

object AssetCurrentLocationsResponse {
  import DateTimeCodecs._

  implicit val AssetCurrentLocationsResponseCodecJson: CodecJson[AssetCurrentLocationsResponse] = CodecJson.derive[AssetCurrentLocationsResponse]
  implicit val AssetCurrentLocationsResponseDecoder: EntityDecoder[AssetCurrentLocationsResponse] = jsonOf[AssetCurrentLocationsResponse]
  implicit val AssetCurrentLocationsResponseEncoder: EntityEncoder[AssetCurrentLocationsResponse] = jsonEncoderOf[AssetCurrentLocationsResponse]
}
