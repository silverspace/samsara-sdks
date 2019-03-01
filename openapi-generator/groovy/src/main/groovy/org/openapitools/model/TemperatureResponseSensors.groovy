package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class TemperatureResponseSensors {
    /* Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported. */
    Integer probeTemperature

    /* Name of the sensor. */
    String name

    /* ID of the sensor. */
    Long id

    /* Currently reported ambient temperature in millidegrees celsius. */
    Integer ambientTemperature

}
