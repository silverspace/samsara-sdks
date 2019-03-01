package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DvirBaseMechanicOrAgentSignature {
    /* ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. */
    Long mechanicUserId

    /* ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. */
    Long driverId

    /* The name of the agent or mechanic who signed the DVIR. */
    String name

    /* The time in millis when the DVIR was signed */
    Long signedAt

    /* Type corresponds to whether the signature corresponds to driver|mechanic. */
    String type

    /* Email of the  agent|mechanic who signed the DVIR. */
    String email

    /* Username of the  agent|mechanic who signed the DVIR. */
    String username

}
