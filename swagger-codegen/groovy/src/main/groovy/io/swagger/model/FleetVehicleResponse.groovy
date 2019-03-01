package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FleetVehicleResponseVehicleInfo;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import java.util.List;
@Canonical
class FleetVehicleResponse {

    Map<String, String> externalIds = new HashMap<String, String>()

  /* Harsh event detection setting. */
  String harshAccelSetting = null

  /* ID of the vehicle. */
  Long id = null

  /* Name of the vehicle. */
  String name = null

    FleetVehicleResponseVehicleInfo vehicleInfo = null
  

}

