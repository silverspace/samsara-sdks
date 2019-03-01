package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DispatchJobCreate;
import org.openapitools.model.JobStatus;

@Canonical
class DispatchJob {
    /* The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. */
    String destinationAddress

    /* ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. */
    Long destinationAddressId

    /* Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
    Double destinationLat

    /* Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
    Double destinationLng

    /* The name of the job destination. If provided, it will take precedence over the name of the address book entry. */
    String destinationName

    /* Notes regarding the details of this job. */
    String notes

    /* The time at which the assigned driver is scheduled to arrive at the job destination. */
    Long scheduledArrivalTimeMs

    /* The time at which the assigned driver is scheduled to depart from the job destination. */
    Long scheduledDepartureTimeMs

    /* The time at which the driver arrived at the job destination. */
    Long arrivedAtMs

    /* The time at which the job was marked complete (e.g. started driving to the next destination). */
    Long completedAtMs

    /* ID of the route that this job belongs to. */
    Long dispatchRouteId

    /* ID of the driver assigned to the dispatch job. */
    Long driverId

    /* The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). */
    Long enRouteAtMs

    /* The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. */
    Long estimatedArrivalMs

    /* Fleet viewer url of the dispatch job. */
    String fleetViewerUrl

    Long groupId

    /* ID of the Samsara dispatch job. */
    Long id

    JobStatus jobState

    /* The time at which the job was marked skipped. */
    Long skippedAtMs

    /* ID of the vehicle used for the dispatch job. */
    Long vehicleId

}
