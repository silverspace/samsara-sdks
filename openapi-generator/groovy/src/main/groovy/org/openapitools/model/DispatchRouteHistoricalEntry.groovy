package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DispatchRoute;

@Canonical
class DispatchRouteHistoricalEntry {
    /* Timestamp that the route was updated, represented as Unix milliseconds since epoch. */
    Long changedAtMs

    DispatchRoute route = null

}
