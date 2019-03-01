package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DriversSummaryResponseSummaries {
    /* ID of the driver. */
    Long driverId

    /* Distance driven in miles, rounded to two decimal places. */
    Double distanceMiles

    /* Duration in milliseconds that driver was driving during the requested time range */
    Long driveMs

    /* Duration in milliseconds that driver was on duty or driving during the requested time range */
    Long activeMs

    /* Username of the driver. */
    String driverUsername

    /* Group of the driver. */
    Long groupId

    /* Name of the driver. */
    String driverName

    /* Duration in milliseconds that driver was on duty during the requested time range */
    Long onDutyMs

}
