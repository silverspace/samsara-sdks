package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.TemperatureResponseSensors;
import java.util.List;
@Canonical
class TemperatureResponse {

    Long groupId = null

    List<TemperatureResponseSensors> sensors = new ArrayList<TemperatureResponseSensors>()
  

}

