goog.provide('API.Client.CargoResponse_sensors');

/**
 * @record
 */
API.Client.CargoResponseSensors = function() {}

/**
 * Flag indicating whether the current cargo is empty or loaded.
 * @type {!boolean}
 * @export
 */
API.Client.CargoResponseSensors.prototype.cargoEmpty;

/**
 * Name of the sensor.
 * @type {!string}
 * @export
 */
API.Client.CargoResponseSensors.prototype.name;

/**
 * ID of the sensor.
 * @type {!number}
 * @export
 */
API.Client.CargoResponseSensors.prototype.id;

