package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AddressGeofenceCircle {
    /* The latitude of the center of the circular geofence */
    Double latitude

    /* The radius of the circular geofence */
    Long radiusMeters

    /* The longitude of the center of the circular geofence */
    Double longitude

}
