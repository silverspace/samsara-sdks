package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AddressGeofence
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param contactIds A list of IDs for contact book entries.
 * @param formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com
 * @param geofence 
 * @param name The name of this address/geofence
 * @param notes Notes associated with an address.
 * @param tagIds A list of tag IDs.
 */
data class InlineObject1 (

        @JsonProperty("contactIds") val contactIds: List<Long>? = null,

        @JsonProperty("formattedAddress") val formattedAddress: String? = null,

        @JsonProperty("geofence") val geofence: AddressGeofence? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("notes") val notes: String? = null,

        @JsonProperty("tagIds") val tagIds: List<Long>? = null
) {

}

