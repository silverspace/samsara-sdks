goog.provide('API.Client.HumidityResponse');

/**
 * Contains the current humidity of a sensor.
 * @record
 */
API.Client.HumidityResponse = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.HumidityResponse.prototype.groupId;

/**
 * @type {!Array<!API.Client.HumidityResponse_sensors>}
 * @export
 */
API.Client.HumidityResponse.prototype.sensors;

