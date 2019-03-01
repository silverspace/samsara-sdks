package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DriverDailyLogResponseDays {
    /* Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. */
    Long certifiedAtMs

    /* End of the HOS day, specified in milliseconds UNIX time. */
    Integer endMs

    /* End of the HOS day, specified in milliseconds UNIX time. */
    Integer startMs

    /* List of trailer ID's associated with the driver for the day. */
    Object trailerIds = null

    /* Hours spent on duty or driving, rounded to two decimal places. */
    Double activeHours

    /* Distance driven in miles, rounded to two decimal places. */
    Double distanceMiles

    /* Milliseconds spent on duty or driving. */
    Long activeMs

    /* Whether this HOS day chart was certified by the driver. */
    Boolean certified

    /* List of vehicle ID's associated with the driver for the day. */
    Object vehicleIds = null

}
