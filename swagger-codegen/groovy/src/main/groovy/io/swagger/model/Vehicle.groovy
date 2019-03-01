package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class Vehicle {

  /* Total engine hours for the vehicle. */
  Long engineHours = null

  /* The fuel level of the vehicle as a percentage. (0.0 to 1.0) */
  Double fuelLevelPercent = null

  /* ID of the vehicle. */
  Long id = null

  /* Name of the vehicle. */
  String name = null

    String note = null

  /* The number of meters reported by the odometer. */
  Long odometerMeters = null

  /* Vehicle Identification Number. */
  String vin = null
  

}

