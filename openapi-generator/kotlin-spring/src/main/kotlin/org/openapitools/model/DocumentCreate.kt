package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DocumentBase
import org.openapitools.model.DocumentField
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param dispatchJobId ID of the Samsara dispatch job for which the document is submitted
 * @param notes Notes submitted with this document.
 * @param documentTypeUuid Universally unique identifier for the document type this document is being created for.
 * @param fields List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
 */
data class DocumentCreate (

        @get:NotNull 
        @JsonProperty("documentTypeUuid") val documentTypeUuid: String,

        @get:NotNull 
        @JsonProperty("fields") val fields: List<DocumentField>,

        @JsonProperty("dispatchJobId") val dispatchJobId: Long? = null,

        @JsonProperty("notes") val notes: String? = null
) {

}

