package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param url Photo URL for a JPG image
 */
data class DocumentFieldCreatePhotoValue (

        @JsonProperty("url") val url: String? = null
) {

}

