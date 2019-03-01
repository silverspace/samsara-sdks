package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AddressGeofence;
import io.swagger.model.ContactIds;
import io.swagger.model.TagIds;
@Canonical
class AddressesAddresses {

    ContactIds contactIds = null

  /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
  String formattedAddress = null

    AddressGeofence geofence = null

  /* The name of this address/geofence */
  String name = null

    String notes = null

    TagIds tagIds = null
  

}

