package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param dispatchJobId ID of the Samsara dispatch job for which the document is submitted
 * @param notes Notes submitted with this document.
 */
data class DocumentBase (

        @JsonProperty("dispatchJobId") val dispatchJobId: Long? = null,

        @JsonProperty("notes") val notes: String? = null
) {

}

