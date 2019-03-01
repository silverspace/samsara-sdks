package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DoorResponseSensors;
import java.util.List;
@Canonical
class DoorResponse {

    Long groupId = null

    List<DoorResponseSensors> sensors = new ArrayList<DoorResponseSensors>()
  

}

