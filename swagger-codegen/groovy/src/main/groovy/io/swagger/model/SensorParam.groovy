package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class SensorParam {

  /* Group ID to query. */
  Long groupId = null

  /* List of sensor IDs to query. */
  List<Long> sensors = new ArrayList<Long>()
  

}

