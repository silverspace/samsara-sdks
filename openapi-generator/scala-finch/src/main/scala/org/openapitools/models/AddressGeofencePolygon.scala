package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AddressGeofencePolygonVertices
import scala.collection.immutable.Seq

/**
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 * @param vertices The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
 */
case class AddressGeofencePolygon(vertices: Option[Seq[AddressGeofencePolygonVertices]]
                )

object AddressGeofencePolygon {
    /**
     * Creates the codec for converting AddressGeofencePolygon from and to JSON.
     */
    implicit val decoder: Decoder[AddressGeofencePolygon] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddressGeofencePolygon] = deriveEncoder
}
