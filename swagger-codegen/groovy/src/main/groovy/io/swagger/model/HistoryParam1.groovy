package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.SensorshistorySeries;
import java.util.List;
@Canonical
class HistoryParam1 {

  /* End of the time range, specified in milliseconds UNIX time. */
  Integer endMs = null

    String fillMissing = FillMissingEnum.WITHNULL

  /* Group ID to query. */
  Long groupId = null

    List<SensorshistorySeries> series = new ArrayList<SensorshistorySeries>()

  /* Beginning of the time range, specified in milliseconds UNIX time. */
  Integer startMs = null

  /* Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. */
  Integer stepMs = null
  

}

