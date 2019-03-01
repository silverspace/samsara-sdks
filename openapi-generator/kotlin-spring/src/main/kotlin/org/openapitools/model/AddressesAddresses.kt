package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AddressGeofence
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param notes Notes associated with an address.
 * @param formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com
 * @param geofence 
 * @param tagIds A list of tag IDs.
 * @param name The name of this address/geofence
 * @param contactIds A list of IDs for contact book entries.
 */
data class AddressesAddresses (

        @get:NotNull 
        @JsonProperty("formattedAddress") val formattedAddress: String,

        @get:NotNull 
        @JsonProperty("geofence") val geofence: AddressGeofence,

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @JsonProperty("notes") val notes: String? = null,

        @JsonProperty("tagIds") val tagIds: List<Long>? = null,

        @JsonProperty("contactIds") val contactIds: List<Long>? = null
) {

}

