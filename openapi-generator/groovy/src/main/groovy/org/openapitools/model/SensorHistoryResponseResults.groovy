package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class SensorHistoryResponseResults {
    /* List of datapoints, one for each requested (sensor, field) pair. */
    List<Long> series = new ArrayList<Long>()

    /* Timestamp in UNIX milliseconds. */
    Integer timeMs

}
