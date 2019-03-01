package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DataInputHistoryResponsePoints;

@Canonical
class DataInputHistoryResponse {
    /* The ID of this data input */
    Long id

    /* Name of this data input */
    String name

    /* Data points from this data input */
    List<DataInputHistoryResponsePoints> points = new ArrayList<DataInputHistoryResponsePoints>()

}
