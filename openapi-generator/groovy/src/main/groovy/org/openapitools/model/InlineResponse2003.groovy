package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.VehicleLocation;

@Canonical
class InlineResponse2003 {
    /* Group ID to query. */
    Long groupId

    List<VehicleLocation> vehicles = new ArrayList<VehicleLocation>()

}
