package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SafetyReportHarshEvent {
    /* Type of the harsh event */
    String harshEventType

    /* Timestamp that the harsh event occurred in Unix milliseconds since epoch */
    Integer timestampMs

    /* Vehicle associated with the harsh event */
    Integer vehicleId

}
