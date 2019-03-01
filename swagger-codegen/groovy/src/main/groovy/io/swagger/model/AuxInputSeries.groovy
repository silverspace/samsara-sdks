package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.AuxInput;
import java.util.List;
@Canonical
class AuxInputSeries {

  /* The name of the aux input. */
  String name = null

    List<AuxInput> values = new ArrayList<AuxInput>()
  

}

