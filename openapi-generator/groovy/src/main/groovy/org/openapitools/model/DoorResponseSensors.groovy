package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DoorResponseSensors {
    /* Flag indicating whether the current door is closed or open. */
    Boolean doorClosed

    /* Name of the sensor. */
    String name

    /* ID of the sensor. */
    Long id

}
