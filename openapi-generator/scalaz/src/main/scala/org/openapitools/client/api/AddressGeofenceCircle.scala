package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AddressGeofenceCircle._

case class AddressGeofenceCircle (
  /* The latitude of the center of the circular geofence */
  latitude: Option[Double],
/* The radius of the circular geofence */
  radiusMeters: Option[Long],
/* The longitude of the center of the circular geofence */
  longitude: Option[Double])

object AddressGeofenceCircle {
  import DateTimeCodecs._

  implicit val AddressGeofenceCircleCodecJson: CodecJson[AddressGeofenceCircle] = CodecJson.derive[AddressGeofenceCircle]
  implicit val AddressGeofenceCircleDecoder: EntityDecoder[AddressGeofenceCircle] = jsonOf[AddressGeofenceCircle]
  implicit val AddressGeofenceCircleEncoder: EntityEncoder[AddressGeofenceCircle] = jsonEncoderOf[AddressGeofenceCircle]
}
