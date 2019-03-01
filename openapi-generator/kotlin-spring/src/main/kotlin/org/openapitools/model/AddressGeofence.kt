package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AddressGeofenceCircle
import org.openapitools.model.AddressGeofencePolygon
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 * @param circle 
 * @param polygon 
 */
data class AddressGeofence (

        @JsonProperty("circle") val circle: AddressGeofenceCircle? = null,

        @JsonProperty("polygon") val polygon: AddressGeofencePolygon? = null
) {

}

