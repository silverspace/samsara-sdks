package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TagModifyAdd;
import org.openapitools.model.TagModifyDelete;

@Canonical
class TagModify {
    TagModifyAdd add = null

    TagModifyDelete delete = null

    /* Updated name of this tag. */
    String name

    /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
    Long parentTagId

}
