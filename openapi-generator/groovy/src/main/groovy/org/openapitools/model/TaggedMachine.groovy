package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TaggedMachineBase;

@Canonical
class TaggedMachine {
    /* The ID of the Machine being tagged. */
    Long id

    /* Name of the Machine being tagged. */
    String name

}
