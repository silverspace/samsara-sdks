package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InlineResponse2005VehicleStats;
import org.openapitools.model.Pagination;

@Canonical
class InlineResponse2005 {
    Pagination pagination = null

    List<InlineResponse2005VehicleStats> vehicleStats = new ArrayList<InlineResponse2005VehicleStats>()

}
