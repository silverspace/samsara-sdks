package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param latitude The longitude of a geofence vertex
 * @param longitude The longitude of a geofence vertex
 */
data class AddressGeofencePolygonVertices (

        @JsonProperty("latitude") val latitude: Double? = null,

        @JsonProperty("longitude") val longitude: Double? = null
) {

}

