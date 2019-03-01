package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class AssetReeferResponseReeferStatsAlarms {

  /* ID of the alarm */
  Long alarmCode = null

  /* Description of the alarm */
  String description = null

  /* Recommended operator action */
  String operatorAction = null

  /* Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action */
  Long severity = null
  

}

