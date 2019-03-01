package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class HosAuthenticationLogsParam {

  /* Driver ID to query. */
  Long driverId = null

  /* End of the time range, specified in milliseconds UNIX time. */
  Integer endMs = null

  /* Group ID to query. */
  Long groupId = null

  /* Beginning of the time range, specified in milliseconds UNIX time. */
  Integer startMs = null
  

}

