package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DataInputHistoryResponsePoints;
import java.util.List;
@Canonical
class DataInputHistoryResponse {

  /* The ID of this data input */
  Long id = null

  /* Name of this data input */
  String name = null

  /* Data points from this data input */
  List<DataInputHistoryResponsePoints> points = new ArrayList<DataInputHistoryResponsePoints>()
  

}

