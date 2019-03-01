package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class DoorResponseSensors {

  /* Flag indicating whether the current door is closed or open. */
  Boolean doorClosed = null

  /* ID of the sensor. */
  Long id = null

  /* Name of the sensor. */
  String name = null
  

}

