package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.SafetyReportHarshEvent;
import java.util.List;
@Canonical
class DriverSafetyScoreResponse {

  /* Crash event count */
  Integer crashCount = null

  /* Driver ID */
  Integer driverId = null

  /* Harsh acceleration event count */
  Integer harshAccelCount = null

  /* Harsh braking event count */
  Integer harshBrakingCount = null

    List<SafetyReportHarshEvent> harshEvents = new ArrayList<SafetyReportHarshEvent>()

  /* Harsh turning event count */
  Integer harshTurningCount = null

  /* Safety Score */
  Integer safetyScore = null

  /* Safety Score Rank */
  String safetyScoreRank = null

  /* Amount of time driven over the speed limit in milliseconds */
  Integer timeOverSpeedLimitMs = null

  /* Total distance driven in meters */
  Integer totalDistanceDrivenMeters = null

  /* Total harsh event count */
  Integer totalHarshEventCount = null

  /* Amount of time driven in milliseconds */
  Integer totalTimeDrivenMs = null
  

}

