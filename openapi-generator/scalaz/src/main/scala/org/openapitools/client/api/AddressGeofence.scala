package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AddressGeofence._

case class AddressGeofence (
  circle: Option[AddressGeofenceCircle],
polygon: Option[AddressGeofencePolygon])

object AddressGeofence {
  import DateTimeCodecs._

  implicit val AddressGeofenceCodecJson: CodecJson[AddressGeofence] = CodecJson.derive[AddressGeofence]
  implicit val AddressGeofenceDecoder: EntityDecoder[AddressGeofence] = jsonOf[AddressGeofence]
  implicit val AddressGeofenceEncoder: EntityEncoder[AddressGeofence] = jsonEncoderOf[AddressGeofence]
}
