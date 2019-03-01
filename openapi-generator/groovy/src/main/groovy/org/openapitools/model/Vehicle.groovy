package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Vehicle {
    /* Total engine hours for the vehicle. */
    Long engineHours

    /* The fuel level of the vehicle as a percentage. (0.0 to 1.0) */
    Double fuelLevelPercent

    /* ID of the vehicle. */
    Long id

    /* Name of the vehicle. */
    String name

    String note

    /* The number of meters reported by the odometer. */
    Long odometerMeters

    /* Vehicle Identification Number. */
    String vin

}
