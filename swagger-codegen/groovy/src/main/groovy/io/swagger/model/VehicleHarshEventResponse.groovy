package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VehicleHarshEventResponseLocation;
@Canonical
class VehicleHarshEventResponse {

  /* URL for downloading the forward facing video */
  String downloadForwardVideoUrl = null

  /* URL for downloading the inward facing video */
  String downloadInwardVideoUrl = null

  /* URL for downloading the tracked inward facing video */
  String downloadTrackedInwardVideoUrl = null

  /* Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] */
  String harshEventType = null

  /* URL of the associated incident report page */
  String incidentReportUrl = null

  /* Whether the driver was deemed distracted during this harsh event */
  Boolean isDistracted = null

    VehicleHarshEventResponseLocation location = null
  

}

