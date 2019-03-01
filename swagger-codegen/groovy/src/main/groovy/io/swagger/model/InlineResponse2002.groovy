package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Pagination;
import io.swagger.model.Vehicle;
import java.util.List;
@Canonical
class InlineResponse2002 {

  /* Group ID to query. */
  Long groupId = null

    Pagination pagination = null

    List<Vehicle> vehicles = new ArrayList<Vehicle>()
  

}

