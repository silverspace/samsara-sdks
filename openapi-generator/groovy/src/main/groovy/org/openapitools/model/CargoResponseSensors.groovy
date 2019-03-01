package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CargoResponseSensors {
    /* Flag indicating whether the current cargo is empty or loaded. */
    Boolean cargoEmpty

    /* Name of the sensor. */
    String name

    /* ID of the sensor. */
    Long id

}
