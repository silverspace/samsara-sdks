package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.JobUpdateObject;
import java.util.List;
@Canonical
class AllRouteJobUpdates {

    List<JobUpdateObject> jobUpdates = new ArrayList<JobUpdateObject>()

  /* Sequence ID of the last update returned in the response */
  String sequenceId = null
  

}

