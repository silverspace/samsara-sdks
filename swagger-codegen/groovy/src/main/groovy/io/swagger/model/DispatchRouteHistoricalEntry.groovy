package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DispatchRoute;
@Canonical
class DispatchRouteHistoricalEntry {

  /* Timestamp that the route was updated, represented as Unix milliseconds since epoch. */
  Long changedAtMs = null

    DispatchRoute route = null
  

}

