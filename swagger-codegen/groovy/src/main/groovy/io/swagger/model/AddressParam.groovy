package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class AddressParam {

  /* The address of the entry to add, as it would be recognized if provided to maps.google.com. */
  String address = null

  /* Group ID to query. */
  Long groupId = null

  /* Name of the location to add to the address book. */
  String name = null

  /* Radius in meters of the address (used for matching vehicle trip stops to this location). */
  Integer radius = null
  

}

