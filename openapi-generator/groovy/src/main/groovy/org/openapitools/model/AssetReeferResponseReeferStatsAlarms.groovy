package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AssetReeferResponseReeferStatsAlarms {
    /* Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action */
    Long severity

    /* Recommended operator action */
    String operatorAction

    /* Description of the alarm */
    String description

    /* ID of the alarm */
    Long alarmCode

}
