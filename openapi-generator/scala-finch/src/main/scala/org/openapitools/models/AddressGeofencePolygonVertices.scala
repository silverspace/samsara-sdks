package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param latitude The longitude of a geofence vertex
 * @param longitude The longitude of a geofence vertex
 */
case class AddressGeofencePolygonVertices(latitude: Option[Double],
                longitude: Option[Double]
                )

object AddressGeofencePolygonVertices {
    /**
     * Creates the codec for converting AddressGeofencePolygonVertices from and to JSON.
     */
    implicit val decoder: Decoder[AddressGeofencePolygonVertices] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddressGeofencePolygonVertices] = deriveEncoder
}
