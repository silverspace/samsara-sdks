package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CargoResponseSensors;

@Canonical
class CargoResponse {
    Long groupId

    List<CargoResponseSensors> sensors = new ArrayList<CargoResponseSensors>()

}
