package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Information about a circular geofence. This field is only populated if the geofence is a circle.
 * @param latitude The latitude of the center of the circular geofence
 * @param radiusMeters The radius of the circular geofence
 * @param longitude The longitude of the center of the circular geofence
 */
data class AddressGeofenceCircle (

        @JsonProperty("latitude") val latitude: Double? = null,

        @JsonProperty("radiusMeters") val radiusMeters: Long? = null,

        @JsonProperty("longitude") val longitude: Double? = null
) {

}

