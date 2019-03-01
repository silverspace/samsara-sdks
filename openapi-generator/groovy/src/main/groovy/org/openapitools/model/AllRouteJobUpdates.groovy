package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.JobUpdateObject;

@Canonical
class AllRouteJobUpdates {
    List<JobUpdateObject> jobUpdates = new ArrayList<JobUpdateObject>()

    /* Sequence ID of the last update returned in the response */
    String sequenceId

}
