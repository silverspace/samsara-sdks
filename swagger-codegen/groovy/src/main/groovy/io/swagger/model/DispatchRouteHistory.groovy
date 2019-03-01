package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DispatchRouteHistoricalEntry;
import java.util.List;
@Canonical
class DispatchRouteHistory {

  /* History of the route's state changes. */
  List<DispatchRouteHistoricalEntry> history = new ArrayList<DispatchRouteHistoricalEntry>()
  

}

