package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AssetReeferResponseReeferStatsPowerStatus {
    /* Timestamp in Unix milliseconds since epoch. */
    Long changedAtMs

    /* Power status of the reefer. */
    String status

}
