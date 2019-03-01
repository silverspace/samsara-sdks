package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import org.openapitools.model.FleetVehicleResponseVehicleInfo;

@Canonical
class FleetVehicleResponse {
    Map<String, String> externalIds = new HashMap<String, String>()

    /* Harsh event detection setting. */
    String harshAccelSetting

    /* ID of the vehicle. */
    Long id

    /* Name of the vehicle. */
    String name

    FleetVehicleResponseVehicleInfo vehicleInfo = null

}
