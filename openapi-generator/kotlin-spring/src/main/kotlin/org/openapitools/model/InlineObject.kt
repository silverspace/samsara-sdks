package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AddressesAddresses
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param addresses 
 */
data class InlineObject (

        @get:NotNull 
        @JsonProperty("addresses") val addresses: List<AddressesAddresses>
) {

}

