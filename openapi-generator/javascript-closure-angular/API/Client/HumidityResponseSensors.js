goog.provide('API.Client.HumidityResponse_sensors');

/**
 * @record
 */
API.Client.HumidityResponseSensors = function() {}

/**
 * Name of the sensor.
 * @type {!string}
 * @export
 */
API.Client.HumidityResponseSensors.prototype.name;

/**
 * Currently reported relative humidity in percent, from 0-100.
 * @type {!number}
 * @export
 */
API.Client.HumidityResponseSensors.prototype.humidity;

/**
 * ID of the sensor.
 * @type {!number}
 * @export
 */
API.Client.HumidityResponseSensors.prototype.id;

