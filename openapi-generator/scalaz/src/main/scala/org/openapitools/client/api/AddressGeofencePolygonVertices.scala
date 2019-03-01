package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AddressGeofencePolygonVertices._

case class AddressGeofencePolygonVertices (
  /* The longitude of a geofence vertex */
  latitude: Option[Double],
/* The longitude of a geofence vertex */
  longitude: Option[Double])

object AddressGeofencePolygonVertices {
  import DateTimeCodecs._

  implicit val AddressGeofencePolygonVerticesCodecJson: CodecJson[AddressGeofencePolygonVertices] = CodecJson.derive[AddressGeofencePolygonVertices]
  implicit val AddressGeofencePolygonVerticesDecoder: EntityDecoder[AddressGeofencePolygonVertices] = jsonOf[AddressGeofencePolygonVertices]
  implicit val AddressGeofencePolygonVerticesEncoder: EntityEncoder[AddressGeofencePolygonVertices] = jsonEncoderOf[AddressGeofencePolygonVertices]
}
