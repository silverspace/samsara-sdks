package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DispatchRoute;
import io.swagger.model.JobStatus;
import io.swagger.model.PrevJobStatus;
@Canonical
class JobUpdateObject {

  /* Timestamp that this event was updated, represented as Unix milliseconds since epoch. */
  Long changedAtMs = null

  /* ID of the Samsara job. */
  Long jobId = null

    JobStatus jobState = null

    PrevJobStatus prevJobState = null

    DispatchRoute route = null

  /* ID of the Samsara dispatch route. */
  Long routeId = null
  

}

