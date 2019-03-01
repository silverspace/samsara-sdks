package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VehicleHarshEventResponseLocation;

@Canonical
class VehicleHarshEventResponse {
    /* URL for downloading the forward facing video */
    String downloadForwardVideoUrl

    /* URL for downloading the inward facing video */
    String downloadInwardVideoUrl

    /* URL for downloading the tracked inward facing video */
    String downloadTrackedInwardVideoUrl

    /* Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] */
    String harshEventType

    /* URL of the associated incident report page */
    String incidentReportUrl

    /* Whether the driver was deemed distracted during this harsh event */
    Boolean isDistracted

    VehicleHarshEventResponseLocation location = null

}
