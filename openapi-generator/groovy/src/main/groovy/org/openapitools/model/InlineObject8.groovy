package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class InlineObject8 {
    /* Driver ID to query. */
    Long driverId

    /* End of the time range, specified in milliseconds UNIX time. */
    Integer endMs

    /* Group ID to query. */
    Long groupId

    /* Beginning of the time range, specified in milliseconds UNIX time. */
    Integer startMs

}
