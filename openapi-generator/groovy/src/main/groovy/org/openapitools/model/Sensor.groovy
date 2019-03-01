package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Sensor {
    /* ID of the sensor. */
    Long id

    /* MAC address of the sensor. */
    String macAddress

    /* Name of the sensor. */
    String name

}
