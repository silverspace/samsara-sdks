package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class DvirBaseNextDriverSignature {

  /* ID of the driver who signed the DVIR */
  Long driverId = null

  /* Email of the  driver who signed the next DVIR on this vehicle. */
  String email = null

  /* The name of the driver who signed the next DVIR on this vehicle. */
  String name = null

  /* The time in millis when the next driver signed the DVIR on this vehicle. */
  Long signedAt = null

  /* Type corresponds to driver. */
  String type = null

  /* Username of the  driver who signed the next DVIR on this vehicle. */
  String username = null
  

}

