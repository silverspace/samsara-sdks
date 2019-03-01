package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DispatchRoute;
import org.openapitools.model.JobStatus;
import org.openapitools.model.PrevJobStatus;

@Canonical
class JobUpdateObject {
    /* Timestamp that this event was updated, represented as Unix milliseconds since epoch. */
    Long changedAtMs

    /* ID of the Samsara job. */
    Long jobId

    JobStatus jobState

    PrevJobStatus prevJobState

    DispatchRoute route = null

    /* ID of the Samsara dispatch route. */
    Long routeId

}
