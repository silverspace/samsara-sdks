package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DispatchJobCreate;
import io.swagger.model.JobStatus;
@Canonical
class DispatchJob {

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

  /* The time at which the driver arrived at the job destination. */
  Long arrivedAtMs = null

  /* The time at which the job was marked complete (e.g. started driving to the next destination). */
  Long completedAtMs = null

  /* ID of the route that this job belongs to. */
  Long dispatchRouteId = null

  /* ID of the driver assigned to the dispatch job. */
  Long driverId = null

  /* The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). */
  Long enRouteAtMs = null

  /* The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. */
  Long estimatedArrivalMs = null

  /* Fleet viewer url of the dispatch job. */
  String fleetViewerUrl = null

    Long groupId = null

  /* ID of the Samsara dispatch job. */
  Long id = null

    JobStatus jobState = null

  /* The time at which the job was marked skipped. */
  Long skippedAtMs = null

  /* ID of the vehicle used for the dispatch job. */
  Long vehicleId = null
  

}

