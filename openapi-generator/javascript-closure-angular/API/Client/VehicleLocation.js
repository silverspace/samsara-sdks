goog.provide('API.Client.VehicleLocation');

/**
 * Contains the location, in latitude and longitude, of a vehicle.
 * @record
 */
API.Client.VehicleLocation = function() {}

/**
 * Heading in degrees.
 * @type {!number}
 * @export
 */
API.Client.VehicleLocation.prototype.heading;

/**
 * ID of the vehicle.
 * @type {!number}
 * @export
 */
API.Client.VehicleLocation.prototype.id;

/**
 * Latitude in decimal degrees.
 * @type {!number}
 * @export
 */
API.Client.VehicleLocation.prototype.latitude;

/**
 * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
 * @type {!string}
 * @export
 */
API.Client.VehicleLocation.prototype.location;

/**
 * Longitude in decimal degrees.
 * @type {!number}
 * @export
 */
API.Client.VehicleLocation.prototype.longitude;

/**
 * Name of the vehicle.
 * @type {!string}
 * @export
 */
API.Client.VehicleLocation.prototype.name;

/**
 * The number of meters reported by the odometer.
 * @type {!number}
 * @export
 */
API.Client.VehicleLocation.prototype.odometerMeters;

/**
 * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
 * @type {!boolean}
 * @export
 */
API.Client.VehicleLocation.prototype.onTrip;

/**
 * Speed in miles per hour.
 * @type {!number}
 * @export
 */
API.Client.VehicleLocation.prototype.speed;

/**
 * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.VehicleLocation.prototype.time;

/**
 * Vehicle Identification Number (VIN) of the vehicle.
 * @type {!string}
 * @export
 */
API.Client.VehicleLocation.prototype.vin;

