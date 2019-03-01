package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TemperatureResponseSensors;

@Canonical
class TemperatureResponse {
    Long groupId

    List<TemperatureResponseSensors> sensors = new ArrayList<TemperatureResponseSensors>()

}
