package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DispatchRouteHistoricalEntry;

@Canonical
class DispatchRouteHistory {
    /* History of the route's state changes. */
    List<DispatchRouteHistoricalEntry> history = new ArrayList<DispatchRouteHistoricalEntry>()

}
