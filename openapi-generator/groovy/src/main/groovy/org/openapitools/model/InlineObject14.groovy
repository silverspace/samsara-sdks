package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Vehicle;

@Canonical
class InlineObject14 {
    /* Group ID to query. */
    Long groupId

    List<Vehicle> vehicles = new ArrayList<Vehicle>()

}
