package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DocumentFieldType
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param fieldTypes The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
 * @param name Name of the document type.
 * @param orgId ID for the organization this document belongs to.
 * @param uuid Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
 */
data class DocumentType (

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @get:NotNull 
        @JsonProperty("orgId") val orgId: Long,

        @get:NotNull 
        @JsonProperty("uuid") val uuid: String,

        @JsonProperty("fieldTypes") val fieldTypes: List<List>? = null
) {

}

