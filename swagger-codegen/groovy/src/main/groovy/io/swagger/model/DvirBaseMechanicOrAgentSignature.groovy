package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class DvirBaseMechanicOrAgentSignature {

  /* ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. */
  Long driverId = null

  /* Email of the  agent|mechanic who signed the DVIR. */
  String email = null

  /* ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. */
  Long mechanicUserId = null

  /* The name of the agent or mechanic who signed the DVIR. */
  String name = null

  /* The time in millis when the DVIR was signed */
  Long signedAt = null

  /* Type corresponds to whether the signature corresponds to driver|mechanic. */
  String type = null

  /* Username of the  agent|mechanic who signed the DVIR. */
  String username = null
  

}

