package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TaggedDriverBase;

@Canonical
class TaggedDriver {
    /* The ID of the Driver being tagged. */
    Long id

    /* Name of the Driver being tagged. */
    String name

}
