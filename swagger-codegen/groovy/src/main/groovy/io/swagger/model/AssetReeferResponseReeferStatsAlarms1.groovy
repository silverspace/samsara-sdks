package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.AssetReeferResponseReeferStatsAlarms;
import java.util.List;
@Canonical
class AssetReeferResponseReeferStatsAlarms1 {

    List<AssetReeferResponseReeferStatsAlarms> alarms = new ArrayList<AssetReeferResponseReeferStatsAlarms>()

  /* Timestamp when the alarms were reported, in Unix milliseconds since epoch */
  Long changedAtMs = null
  

}

