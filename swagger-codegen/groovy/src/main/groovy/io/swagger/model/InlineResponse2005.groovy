package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.InlineResponse2005VehicleStats;
import io.swagger.model.Pagination;
import java.util.List;
@Canonical
class InlineResponse2005 {

    Pagination pagination = null

    List<InlineResponse2005VehicleStats> vehicleStats = new ArrayList<InlineResponse2005VehicleStats>()
  

}

