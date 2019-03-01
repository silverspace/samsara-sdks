package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class HosLogsSummaryResponseDrivers {

  /* The amount of remaining cycle time (in ms). */
  Long cycleRemaining = null

  /* The amount of cycle time (in ms) available tomorrow. */
  Long cycleTomorrow = null

  /* ID of the driver. */
  Long driverId = null

  /* Name of the driver. */
  String driverName = null

  /* The amount of driving time in violation in this cycle (in ms). */
  Long drivingInViolationCycle = null

  /* The amount of driving time in violation today (in ms). */
  Long drivingInViolationToday = null

  /* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
  String dutyStatus = null

  /* The amount of remaining shift drive time (in ms). */
  Long shiftDriveRemaining = null

  /* The amount of remaining shift time (in ms). */
  Long shiftRemaining = null

  /* The amount of time (in ms) that the driver has been in the current `dutyStatus`. */
  Long timeInCurrentStatus = null

  /* The amount of time (in ms) remaining until the driver cannot drive without a rest break. */
  Long timeUntilBreak = null

  /* Name of the vehicle. */
  String vehicleName = null
  

}

