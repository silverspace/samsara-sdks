package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class AddressGeofenceCircle {

  /* The latitude of the center of the circular geofence */
  Double latitude = null

  /* The longitude of the center of the circular geofence */
  Double longitude = null

  /* The radius of the circular geofence */
  Long radiusMeters = null
  

}

