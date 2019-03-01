package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SensorsHistorySeries;

@Canonical
class InlineObject21 {
    /* End of the time range, specified in milliseconds UNIX time. */
    Integer endMs

    String fillMissing = FillMissingEnum.WITHNULL

    /* Group ID to query. */
    Long groupId

    List<SensorsHistorySeries> series = new ArrayList<SensorsHistorySeries>()

    /* Beginning of the time range, specified in milliseconds UNIX time. */
    Integer startMs

    /* Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. */
    Integer stepMs

}
