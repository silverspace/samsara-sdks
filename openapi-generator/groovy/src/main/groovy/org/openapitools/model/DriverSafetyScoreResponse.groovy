package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SafetyReportHarshEvent;

@Canonical
class DriverSafetyScoreResponse {
    /* Crash event count */
    Integer crashCount

    /* Driver ID */
    Integer driverId

    /* Harsh acceleration event count */
    Integer harshAccelCount

    /* Harsh braking event count */
    Integer harshBrakingCount

    List<SafetyReportHarshEvent> harshEvents = new ArrayList<SafetyReportHarshEvent>()

    /* Harsh turning event count */
    Integer harshTurningCount

    /* Safety Score */
    Integer safetyScore

    /* Safety Score Rank */
    String safetyScoreRank

    /* Amount of time driven over the speed limit in milliseconds */
    Integer timeOverSpeedLimitMs

    /* Total distance driven in meters */
    Integer totalDistanceDrivenMeters

    /* Total harsh event count */
    Integer totalHarshEventCount

    /* Amount of time driven in milliseconds */
    Integer totalTimeDrivenMs

}
