package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class HumidityResponseSensors {
    /* Name of the sensor. */
    String name

    /* Currently reported relative humidity in percent, from 0-100. */
    Integer humidity

    /* ID of the sensor. */
    Long id

}
