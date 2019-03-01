package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class HosLogsResponseLogs {
    /* Longitude at which the log was recorded. */
    Double locLng

    /* The time at which the log/HOS status started in UNIX milliseconds. */
    Long logStartMs

    /* ID of the driver. */
    Long driverId

    /* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
    String statusType

    /* City in which the log was recorded. */
    String locCity

    /* ID of the group. */
    Long groupId

    /* Name of location at which the log was recorded. */
    String locName

    /* Latitude at which the log was recorded. */
    Double locLat

    /* Remark associated with the log entry. */
    String remark

    /* State in which the log was recorded. */
    String locState

    /* ID of the vehicle. */
    Long vehicleId

    List<Long> codriverIds = new ArrayList<Long>()

}
