package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class AuxInput {

  /* Timestamp in Unix epoch milliseconds. */
  BigDecimal timeMs = null

  /* Boolean representing the digital value of the aux input. */
  Boolean value = null
  

}

