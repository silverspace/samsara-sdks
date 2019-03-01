package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class DispatchJobCreate {

  /* The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. */
  String destinationAddress = null

  /* ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. */
  Long destinationAddressId = null

  /* Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
  Double destinationLat = null

  /* Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
  Double destinationLng = null

  /* The name of the job destination. If provided, it will take precedence over the name of the address book entry. */
  String destinationName = null

  /* Notes regarding the details of this job. */
  String notes = null

  /* The time at which the assigned driver is scheduled to arrive at the job destination. */
  Long scheduledArrivalTimeMs = null

  /* The time at which the assigned driver is scheduled to depart from the job destination. */
  Long scheduledDepartureTimeMs = null
  

}

