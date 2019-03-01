package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 * @param numDecimalPlaces Number of decimal places that values for this field type can have.
 */
data class DocumentFieldTypeNumberValueTypeMetadata (

        @JsonProperty("numDecimalPlaces") val numDecimalPlaces: Long? = null
) {

}

