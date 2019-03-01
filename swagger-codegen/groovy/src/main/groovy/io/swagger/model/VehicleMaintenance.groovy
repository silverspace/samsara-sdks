package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VehicleMaintenanceJ1939;
import io.swagger.model.VehicleMaintenancePassenger;
@Canonical
class VehicleMaintenance {

  /* ID of the vehicle. */
  Long id = null

    VehicleMaintenanceJ1939 j1939 = null

    VehicleMaintenancePassenger passenger = null
  

}

