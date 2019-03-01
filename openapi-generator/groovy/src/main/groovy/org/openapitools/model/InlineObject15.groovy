package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class InlineObject15 {
    /* End of the time range, specified in milliseconds UNIX time. */
    Integer endMs

    /* Group ID to query. */
    Long groupId

    /* Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs */
    Integer startMs

    /* Vehicle ID to query. */
    Long vehicleId

}
