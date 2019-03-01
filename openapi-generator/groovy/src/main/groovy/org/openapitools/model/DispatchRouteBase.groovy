package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DispatchRouteBase {
    /* The time in Unix epoch milliseconds that the route actually ended. */
    Long actualEndMs

    /* The time in Unix epoch milliseconds that the route actually started. */
    Long actualStartMs

    /* ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. */
    Long driverId

    /* ID of the group if the organization has multiple groups (optional). */
    Long groupId

    /* Descriptive name of this route. */
    String name

    /* The time in Unix epoch milliseconds that the last job in the route is scheduled to end. */
    Long scheduledEndMs

    /* The distance expected to be traveled for this route in meters. */
    Long scheduledMeters

    /* The time in Unix epoch milliseconds that the route is scheduled to start. */
    Long scheduledStartMs

    /* The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. */
    String startLocationAddress

    /* ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. */
    Long startLocationAddressId

    /* Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
    Double startLocationLat

    /* Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
    Double startLocationLng

    /* The name of the route's starting location. If provided, it will take precedence over the name of the address book entry. */
    String startLocationName

    /* ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. */
    Long trailerId

    /* ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. */
    Long vehicleId

}
