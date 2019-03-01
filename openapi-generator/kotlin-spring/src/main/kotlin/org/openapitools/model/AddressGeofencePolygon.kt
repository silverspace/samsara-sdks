package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AddressGeofencePolygonVertices
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 * @param vertices The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
 */
data class AddressGeofencePolygon (

        @JsonProperty("vertices") val vertices: List<AddressGeofencePolygonVertices>? = null
) {

}

