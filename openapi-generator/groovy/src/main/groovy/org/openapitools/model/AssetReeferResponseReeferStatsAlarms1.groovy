package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AssetReeferResponseReeferStatsAlarms;

@Canonical
class AssetReeferResponseReeferStatsAlarms1 {
    List<AssetReeferResponseReeferStatsAlarms> alarms = new ArrayList<AssetReeferResponseReeferStatsAlarms>()

    /* Timestamp when the alarms were reported, in Unix milliseconds since epoch */
    Long changedAtMs

}
