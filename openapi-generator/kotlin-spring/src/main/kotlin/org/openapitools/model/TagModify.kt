package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TagModifyAdd
import org.openapitools.model.TagModifyDelete
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param add 
 * @param delete 
 * @param name Updated name of this tag.
 * @param parentTagId If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
 */
data class TagModify (

        @JsonProperty("add") val add: TagModifyAdd? = null,

        @JsonProperty("delete") val delete: TagModifyDelete? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("parentTagId") val parentTagId: Long? = null
) {

}

