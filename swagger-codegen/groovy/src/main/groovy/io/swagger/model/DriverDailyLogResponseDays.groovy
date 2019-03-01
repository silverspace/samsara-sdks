package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class DriverDailyLogResponseDays {

  /* Hours spent on duty or driving, rounded to two decimal places. */
  Double activeHours = null

  /* Milliseconds spent on duty or driving. */
  Long activeMs = null

  /* Whether this HOS day chart was certified by the driver. */
  Boolean certified = null

  /* Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. */
  Long certifiedAtMs = null

  /* Distance driven in miles, rounded to two decimal places. */
  Double distanceMiles = null

  /* End of the HOS day, specified in milliseconds UNIX time. */
  Integer endMs = null

  /* End of the HOS day, specified in milliseconds UNIX time. */
  Integer startMs = null

  /* List of trailer ID's associated with the driver for the day. */
  Object trailerIds = null

  /* List of vehicle ID's associated with the driver for the day. */
  Object vehicleIds = null
  

}

