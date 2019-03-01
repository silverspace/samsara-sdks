package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class VehicleHarshEventResponseLocation {
    /* Address of location where the harsh event occurred */
    String address

    /* Latitude of location where the harsh event occurred */
    String latitude

    /* Longitude of location where the harsh event occurred */
    String longitude

}
