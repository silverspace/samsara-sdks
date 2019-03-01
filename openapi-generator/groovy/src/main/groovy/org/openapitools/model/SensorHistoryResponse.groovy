package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SensorHistoryResponseResults;

@Canonical
class SensorHistoryResponse {
    List<SensorHistoryResponseResults> results = new ArrayList<SensorHistoryResponseResults>()

}
