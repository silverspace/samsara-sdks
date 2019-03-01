package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DocumentFieldTypeNumberValueTypeMetadata
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param label Descriptive name of this field type.
 * @param numberValueTypeMetadata 
 * @param valueType The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
 */
data class DocumentFieldType (

        @get:NotNull 
        @JsonProperty("label") val label: String,

        @get:NotNull 
        @JsonProperty("valueType") val valueType: String,

        @JsonProperty("numberValueTypeMetadata") val numberValueTypeMetadata: DocumentFieldTypeNumberValueTypeMetadata? = null
) {

}

