package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Vehicle;
import java.util.List;
@Canonical
class VehicleUpdateParam {

  /* Group ID to query. */
  Long groupId = null

    List<Vehicle> vehicles = new ArrayList<Vehicle>()
  

}

