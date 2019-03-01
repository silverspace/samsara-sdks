package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DocumentFieldCreatePhotoValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param numberValue Value of this field if this document field has valueType: ValueType_Number.
 * @param photoValue Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
 * @param stringValue Value of this field if this document field has valueType: ValueType_String.
 * @param valueType Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
 */
data class DocumentFieldCreate (

        @get:NotNull 
        @JsonProperty("valueType") val valueType: String,

        @JsonProperty("numberValue") val numberValue: Double? = null,

        @JsonProperty("photoValue") val photoValue: List<DocumentFieldCreatePhotoValue>? = null,

        @JsonProperty("stringValue") val stringValue: String? = null
) {

}

