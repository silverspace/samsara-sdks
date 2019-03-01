goog.provide('API.Client.DispatchJobCreate');

/**
 * @record
 */
API.Client.DispatchJobCreate = function() {}

/**
 * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
 * @type {!string}
 * @export
 */
API.Client.DispatchJobCreate.prototype.destinationAddress;

/**
 * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
 * @type {!number}
 * @export
 */
API.Client.DispatchJobCreate.prototype.destinationAddressId;

/**
 * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @type {!number}
 * @export
 */
API.Client.DispatchJobCreate.prototype.destinationLat;

/**
 * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @type {!number}
 * @export
 */
API.Client.DispatchJobCreate.prototype.destinationLng;

/**
 * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
 * @type {!string}
 * @export
 */
API.Client.DispatchJobCreate.prototype.destinationName;

/**
 * Notes regarding the details of this job.
 * @type {!string}
 * @export
 */
API.Client.DispatchJobCreate.prototype.notes;

/**
 * The time at which the assigned driver is scheduled to arrive at the job destination.
 * @type {!number}
 * @export
 */
API.Client.DispatchJobCreate.prototype.scheduledArrivalTimeMs;

/**
 * The time at which the assigned driver is scheduled to depart from the job destination.
 * @type {!number}
 * @export
 */
API.Client.DispatchJobCreate.prototype.scheduledDepartureTimeMs;

