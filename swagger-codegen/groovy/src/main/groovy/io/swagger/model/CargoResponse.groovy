package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.CargoResponseSensors;
import java.util.List;
@Canonical
class CargoResponse {

    Long groupId = null

    List<CargoResponseSensors> sensors = new ArrayList<CargoResponseSensors>()
  

}

