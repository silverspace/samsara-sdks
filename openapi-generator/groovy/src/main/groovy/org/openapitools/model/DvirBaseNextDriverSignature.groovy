package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DvirBaseNextDriverSignature {
    /* ID of the driver who signed the DVIR */
    Long driverId

    /* The name of the driver who signed the next DVIR on this vehicle. */
    String name

    /* The time in millis when the next driver signed the DVIR on this vehicle. */
    Long signedAt

    /* Type corresponds to driver. */
    String type

    /* Email of the  driver who signed the next DVIR on this vehicle. */
    String email

    /* Username of the  driver who signed the next DVIR on this vehicle. */
    String username

}
