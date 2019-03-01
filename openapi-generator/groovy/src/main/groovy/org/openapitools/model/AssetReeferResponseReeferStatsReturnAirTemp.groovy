package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AssetReeferResponseReeferStatsReturnAirTemp {
    /* Return air temperature in millidegree Celsius. */
    Long tempInMilliC

    /* Timestamp in Unix milliseconds since epoch. */
    Long changedAtMs

}
