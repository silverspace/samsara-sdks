goog.provide('API.Client.DispatchJob');

/**
 * @record
 */
API.Client.DispatchJob = function() {}

/**
 * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
 * @type {!string}
 * @export
 */
API.Client.DispatchJob.prototype.destinationAddress;

/**
 * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.destinationAddressId;

/**
 * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.destinationLat;

/**
 * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.destinationLng;

/**
 * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
 * @type {!string}
 * @export
 */
API.Client.DispatchJob.prototype.destinationName;

/**
 * Notes regarding the details of this job.
 * @type {!string}
 * @export
 */
API.Client.DispatchJob.prototype.notes;

/**
 * The time at which the assigned driver is scheduled to arrive at the job destination.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.scheduledArrivalTimeMs;

/**
 * The time at which the assigned driver is scheduled to depart from the job destination.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.scheduledDepartureTimeMs;

/**
 * The time at which the driver arrived at the job destination.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.arrivedAtMs;

/**
 * The time at which the job was marked complete (e.g. started driving to the next destination).
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.completedAtMs;

/**
 * ID of the route that this job belongs to.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.dispatchRouteId;

/**
 * ID of the driver assigned to the dispatch job.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.driverId;

/**
 * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.enRouteAtMs;

/**
 * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.estimatedArrivalMs;

/**
 * Fleet viewer url of the dispatch job.
 * @type {!string}
 * @export
 */
API.Client.DispatchJob.prototype.fleetViewerUrl;

/**
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.groupId;

/**
 * ID of the Samsara dispatch job.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.id;

/**
 * @type {!API.Client.jobStatus}
 * @export
 */
API.Client.DispatchJob.prototype.jobState;

/**
 * The time at which the job was marked skipped.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.skippedAtMs;

/**
 * ID of the vehicle used for the dispatch job.
 * @type {!number}
 * @export
 */
API.Client.DispatchJob.prototype.vehicleId;

