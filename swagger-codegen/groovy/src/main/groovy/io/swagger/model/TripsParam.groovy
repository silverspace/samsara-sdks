package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class TripsParam {

  /* End of the time range, specified in milliseconds UNIX time. */
  Integer endMs = null

  /* Group ID to query. */
  Long groupId = null

  /* Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs */
  Integer startMs = null

  /* Vehicle ID to query. */
  Long vehicleId = null
  

}

