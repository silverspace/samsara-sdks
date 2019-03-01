goog.provide('API.Client.TripResponse_trips');

/**
 * @record
 */
API.Client.TripResponseTrips = function() {}

/**
 * Odometer reading at the end of the trip.
 * @type {!number}
 * @export
 */
API.Client.TripResponseTrips.prototype.endOdometer;

/**
 * Length of the trip in meters.
 * @type {!number}
 * @export
 */
API.Client.TripResponseTrips.prototype.distanceMeters;

/**
 * End of the trip in UNIX milliseconds.
 * @type {!number}
 * @export
 */
API.Client.TripResponseTrips.prototype.endMs;

/**
 * Beginning of the trip in UNIX milliseconds.
 * @type {!number}
 * @export
 */
API.Client.TripResponseTrips.prototype.startMs;

/**
 * Amount in milliliters of fuel consumed on this trip.
 * @type {!number}
 * @export
 */
API.Client.TripResponseTrips.prototype.fuelConsumedMl;

/**
 * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
 * @type {!string}
 * @export
 */
API.Client.TripResponseTrips.prototype.startAddress;

/**
 * @type {!API.Client.TripResponse_startCoordinates}
 * @export
 */
API.Client.TripResponseTrips.prototype.startCoordinates;

/**
 * @type {!API.Client.TripResponse_endCoordinates}
 * @export
 */
API.Client.TripResponseTrips.prototype.endCoordinates;

/**
 * Odometer reading at the beginning of the trip.
 * @type {!number}
 * @export
 */
API.Client.TripResponseTrips.prototype.startOdometer;

/**
 * ID of the driver.
 * @type {!number}
 * @export
 */
API.Client.TripResponseTrips.prototype.driverId;

/**
 * Geocoded street address of start (latitude, longitude) coordinates.
 * @type {!string}
 * @export
 */
API.Client.TripResponseTrips.prototype.startLocation;

/**
 * Length in meters trip spent on toll roads.
 * @type {!number}
 * @export
 */
API.Client.TripResponseTrips.prototype.tollMeters;

/**
 * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
 * @type {!string}
 * @export
 */
API.Client.TripResponseTrips.prototype.endAddress;

/**
 * Geocoded street address of start (latitude, longitude) coordinates.
 * @type {!string}
 * @export
 */
API.Client.TripResponseTrips.prototype.endLocation;

