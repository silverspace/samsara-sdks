package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AddressGeofenceCircle;
import org.openapitools.model.AddressGeofencePolygon;

@Canonical
class AddressGeofence {
    AddressGeofenceCircle circle = null

    AddressGeofencePolygon polygon = null

}
