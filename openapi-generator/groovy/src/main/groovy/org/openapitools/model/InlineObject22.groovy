package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class InlineObject22 {
    /* Group ID to query. */
    Long groupId

    /* List of sensor IDs to query. */
    List<Long> sensors = new ArrayList<Long>()

}
