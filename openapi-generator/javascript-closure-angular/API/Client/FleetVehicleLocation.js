goog.provide('API.Client.FleetVehicleLocation');

/**
 * Contains the location and speed of a vehicle at a particular time
 * @record
 */
API.Client.FleetVehicleLocation = function() {}

/**
 * The latitude of the location in degrees.
 * @type {!number}
 * @export
 */
API.Client.FleetVehicleLocation.prototype.latitude;

/**
 * The best effort (street,city,state) for the latitude and longitude.
 * @type {!string}
 * @export
 */
API.Client.FleetVehicleLocation.prototype.location;

/**
 * The longitude of the location in degrees.
 * @type {!number}
 * @export
 */
API.Client.FleetVehicleLocation.prototype.longitude;

/**
 * The speed calculated from GPS that the asset was traveling at in miles per hour.
 * @type {!number}
 * @export
 */
API.Client.FleetVehicleLocation.prototype.speedMilesPerHour;

/**
 * Time in Unix milliseconds since epoch when the asset was at the location.
 * @type {!number}
 * @export
 */
API.Client.FleetVehicleLocation.prototype.timeMs;

