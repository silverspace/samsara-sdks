goog.provide('API.Client.DispatchRouteCreate');

/**
 * @record
 */
API.Client.DispatchRouteCreate = function() {}

/**
 * The time in Unix epoch milliseconds that the route actually ended.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.actualEndMs;

/**
 * The time in Unix epoch milliseconds that the route actually started.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.actualStartMs;

/**
 * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.driverId;

/**
 * ID of the group if the organization has multiple groups (optional).
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.groupId;

/**
 * Descriptive name of this route.
 * @type {!string}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.name;

/**
 * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.scheduledEndMs;

/**
 * The distance expected to be traveled for this route in meters.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.scheduledMeters;

/**
 * The time in Unix epoch milliseconds that the route is scheduled to start.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.scheduledStartMs;

/**
 * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
 * @type {!string}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.startLocationAddress;

/**
 * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.startLocationAddressId;

/**
 * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.startLocationLat;

/**
 * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.startLocationLng;

/**
 * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
 * @type {!string}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.startLocationName;

/**
 * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.trailerId;

/**
 * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.vehicleId;

/**
 * The dispatch jobs to create for this route.
 * @type {!Array<!API.Client.DispatchJobCreate>}
 * @export
 */
API.Client.DispatchRouteCreate.prototype.dispatchJobs;

