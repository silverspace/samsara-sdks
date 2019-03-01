package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AddressGeofence
import org.openapitools.model.Contact
import org.openapitools.model.TagMetadata
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 * @param contacts 
 * @param formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com
 * @param geofence 
 * @param id ID of the address
 * @param name Name of the address or geofence
 * @param notes Notes associated with an address.
 * @param tags 
 */
data class Address (

        @JsonProperty("contacts") val contacts: List<Contact>? = null,

        @JsonProperty("formattedAddress") val formattedAddress: String? = null,

        @JsonProperty("geofence") val geofence: AddressGeofence? = null,

        @JsonProperty("id") val id: Long? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("notes") val notes: String? = null,

        @JsonProperty("tags") val tags: List<TagMetadata>? = null
) {

}

