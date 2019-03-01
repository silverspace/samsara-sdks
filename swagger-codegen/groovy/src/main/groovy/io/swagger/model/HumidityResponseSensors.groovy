package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class HumidityResponseSensors {

  /* Currently reported relative humidity in percent, from 0-100. */
  Integer humidity = null

  /* ID of the sensor. */
  Long id = null

  /* Name of the sensor. */
  String name = null
  

}

