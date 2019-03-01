package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Tag
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param tags 
 */
data class InlineResponse2009 (

        @JsonProperty("tags") val tags: List<Tag>? = null
) {

}

