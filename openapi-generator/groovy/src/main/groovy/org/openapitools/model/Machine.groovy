package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Machine {
    /* ID of the machine. */
    Long id

    /* Name of the machine. */
    String name

    /* Notes about the machine */
    String notes

}
