goog.provide('API.Client.Vehicle');

/**
 * A vehicle object.
 * @record
 */
API.Client.Vehicle = function() {}

/**
 * Total engine hours for the vehicle.
 * @type {!number}
 * @export
 */
API.Client.Vehicle.prototype.engineHours;

/**
 * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
 * @type {!number}
 * @export
 */
API.Client.Vehicle.prototype.fuelLevelPercent;

/**
 * ID of the vehicle.
 * @type {!number}
 * @export
 */
API.Client.Vehicle.prototype.id;

/**
 * Name of the vehicle.
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.note;

/**
 * The number of meters reported by the odometer.
 * @type {!number}
 * @export
 */
API.Client.Vehicle.prototype.odometerMeters;

/**
 * Vehicle Identification Number.
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.vin;

