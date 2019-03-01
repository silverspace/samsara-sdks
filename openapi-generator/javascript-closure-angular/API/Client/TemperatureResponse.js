goog.provide('API.Client.TemperatureResponse');

/**
 * Contains the current temperatures of a sensor.
 * @record
 */
API.Client.TemperatureResponse = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.TemperatureResponse.prototype.groupId;

/**
 * @type {!Array<!API.Client.TemperatureResponse_sensors>}
 * @export
 */
API.Client.TemperatureResponse.prototype.sensors;

