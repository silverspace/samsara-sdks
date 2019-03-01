package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class AssetLocationResponseInner {

  /* The latitude of the location in degrees. */
  Double latitude = null

  /* The best effort (street,city,state) for the latitude and longitude. */
  String location = null

  /* The longitude of the location in degrees. */
  Double longitude = null

  /* The speed calculated from GPS that the asset was traveling at in miles per hour. */
  Double speedMilesPerHour = null

  /* Time in Unix milliseconds since epoch when the asset was at the location. */
  BigDecimal time = null
  

}

