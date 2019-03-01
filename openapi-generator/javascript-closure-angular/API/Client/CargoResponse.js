goog.provide('API.Client.CargoResponse');

/**
 * Contains the current cargo status of a sensor.
 * @record
 */
API.Client.CargoResponse = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.CargoResponse.prototype.groupId;

/**
 * @type {!Array<!API.Client.CargoResponse_sensors>}
 * @export
 */
API.Client.CargoResponse.prototype.sensors;

