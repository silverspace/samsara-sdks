package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class FleetVehicleResponseVehicleInfo {
    /* Year of the vehicle. */
    Long year

    /* Model of the Vehicle. */
    String model

    /* Vehicle Identification Number. */
    String vin

    /* Make of the vehicle. */
    String make

}
