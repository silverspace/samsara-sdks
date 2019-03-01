package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.VehicleLocation;
import java.util.List;
@Canonical
class InlineResponse2003 {

  /* Group ID to query. */
  Long groupId = null

    List<VehicleLocation> vehicles = new ArrayList<VehicleLocation>()
  

}

