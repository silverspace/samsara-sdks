package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HumidityResponseSensors;
import java.util.List;
@Canonical
class HumidityResponse {

    Long groupId = null

    List<HumidityResponseSensors> sensors = new ArrayList<HumidityResponseSensors>()
  

}

