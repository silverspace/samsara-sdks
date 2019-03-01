package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class DriversSummaryResponseSummaries {

  /* Duration in milliseconds that driver was on duty or driving during the requested time range */
  Long activeMs = null

  /* Distance driven in miles, rounded to two decimal places. */
  Double distanceMiles = null

  /* Duration in milliseconds that driver was driving during the requested time range */
  Long driveMs = null

  /* ID of the driver. */
  Long driverId = null

  /* Name of the driver. */
  String driverName = null

  /* Username of the driver. */
  String driverUsername = null

  /* Group of the driver. */
  Long groupId = null

  /* Duration in milliseconds that driver was on duty during the requested time range */
  Long onDutyMs = null
  

}

