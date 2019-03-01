package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class HosLogsResponseLogs {

    List<Long> codriverIds = new ArrayList<Long>()

  /* ID of the driver. */
  Long driverId = null

  /* ID of the group. */
  Long groupId = null

  /* City in which the log was recorded. */
  String locCity = null

  /* Latitude at which the log was recorded. */
  Double locLat = null

  /* Longitude at which the log was recorded. */
  Double locLng = null

  /* Name of location at which the log was recorded. */
  String locName = null

  /* State in which the log was recorded. */
  String locState = null

  /* The time at which the log/HOS status started in UNIX milliseconds. */
  Long logStartMs = null

  /* Remark associated with the log entry. */
  String remark = null

  /* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
  String statusType = null

  /* ID of the vehicle. */
  Long vehicleId = null
  

}

