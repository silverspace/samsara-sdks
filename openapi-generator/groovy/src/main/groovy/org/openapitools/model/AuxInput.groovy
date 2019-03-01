package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AuxInput {
    /* Timestamp in Unix epoch milliseconds. */
    Object timeMs

    /* Boolean representing the digital value of the aux input. */
    Boolean value

}
