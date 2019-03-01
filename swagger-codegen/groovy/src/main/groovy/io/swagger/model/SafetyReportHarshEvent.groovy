package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SafetyReportHarshEvent {

  /* Type of the harsh event */
  String harshEventType = null

  /* Timestamp that the harsh event occurred in Unix milliseconds since epoch */
  Integer timestampMs = null

  /* Vehicle associated with the harsh event */
  Integer vehicleId = null
  

}

