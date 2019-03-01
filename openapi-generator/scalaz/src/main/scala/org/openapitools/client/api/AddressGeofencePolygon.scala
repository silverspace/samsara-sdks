package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AddressGeofencePolygon._

case class AddressGeofencePolygon (
  /* The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40. */
  vertices: Option[List[AddressGeofencePolygonVertices]])

object AddressGeofencePolygon {
  import DateTimeCodecs._

  implicit val AddressGeofencePolygonCodecJson: CodecJson[AddressGeofencePolygon] = CodecJson.derive[AddressGeofencePolygon]
  implicit val AddressGeofencePolygonDecoder: EntityDecoder[AddressGeofencePolygon] = jsonOf[AddressGeofencePolygon]
  implicit val AddressGeofencePolygonEncoder: EntityEncoder[AddressGeofencePolygon] = jsonEncoderOf[AddressGeofencePolygon]
}
