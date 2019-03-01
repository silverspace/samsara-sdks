package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VehicleMaintenanceJ1939;
import org.openapitools.model.VehicleMaintenancePassenger;

@Canonical
class VehicleMaintenance {
    /* ID of the vehicle. */
    Long id

    VehicleMaintenanceJ1939 j1939 = null

    VehicleMaintenancePassenger passenger = null

}
