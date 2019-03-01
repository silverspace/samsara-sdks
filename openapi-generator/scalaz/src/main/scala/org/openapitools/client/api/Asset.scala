package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Asset._

case class Asset (
  /* Serial number of the host asset */
  assetSerialNumber: Option[String],
/* The cable connected to the asset */
  cable: Option[List[AssetCable]],
/* Engine hours */
  engineHours: Option[Integer],
/* Asset ID */
  id: Long,
/* Asset name */
  name: Option[String])

object Asset {
  import DateTimeCodecs._

  implicit val AssetCodecJson: CodecJson[Asset] = CodecJson.derive[Asset]
  implicit val AssetDecoder: EntityDecoder[Asset] = jsonOf[Asset]
  implicit val AssetEncoder: EntityEncoder[Asset] = jsonEncoderOf[Asset]
}
